package com.example.hello.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProvider implements ApplicationContextAware {
    // 컨테이너에 접근하기 위한 로직 왜? 직접 접근해서 빈 가져오려구

    private static class ApplicationContextHolder {

        private static final InnerContextResource CONTEXT_PROV = new InnerContextResource();

        private ApplicationContextHolder() {
            super();
        }

    }

    private static final class InnerContextResource {
        private ApplicationContext context;

        private InnerContextResource() {
            super();
        }

        private void setContext(ApplicationContext context) {
            this.context  = context;
        }
    }

    public static ApplicationContext getContext() {
        return ApplicationContextHolder.CONTEXT_PROV.context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextHolder.CONTEXT_PROV.setContext(applicationContext);
    }

//    private static ApplicationContext context;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        context = applicationContext;
//    }
//
//    public static ApplicationContext getContext(){
//        return context;
//    }

}
