package lk.topcat.topcatpmdivition.api;

import lk.topcat.topcatpmdivition.api.config.WebAppConfig;
import lk.topcat.topcatpmdivition.api.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//        registration.setMultipartConfig(new MultipartConfigElement("/tmp"));
//    }

}
