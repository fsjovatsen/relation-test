package no.fint.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class FintRelationAspect {
    @Around("@annotation(no.fint.role.annotations.FintSelfId)")
    public Object executeEndpoint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method requestMethod = signature.getMethod();

        FintRole fintRole = requestMethod.getAnnotation(FintRole.class);
        String accessRole = fintRole.role();
        String roleHeaderName = fintRole.roleHeaderName();

        Optional<String> roleInHeader = getRoleFromHeader(roleHeaderName);
        if (roleInHeader.isPresent()) {
            if (roleInHeader.get().equals(accessRole)) {
                return proceedingJoinPoint.proceed();
            } else {
                throw new RoleForbiddenException(String.format("The role '%s' has no access to this service.", roleInHeader.get()));
            }
        } else {
            throw new MissingHeaderException(String.format("Missing '%s' header.", roleHeaderName));
        }
    }

}
