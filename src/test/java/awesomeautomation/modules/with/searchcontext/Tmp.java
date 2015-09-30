//package awesomeautomation.modules.with.searchcontext;
//
//import groovy.lang.Closure;
//import org.codehaus.groovy.runtime.DefaultGroovyMethods;
//import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.internal.WrapsDriver;
//
//import static org.codehaus.groovy.runtime.DefaultGroovyMethods.invokeMethod;
//
///**
// * Created by viskyo on 29/09/2015.
// */
//public class Tmp {
//
//    public Tmp(final Object context) {
//
//        this.searchContext = ((SearchContext) (context));
//
//        if (context.getClass().isAssignableFrom(WebElement.class)) {
//
//            invokeMethod("tryUntil", new Object[]{new Closure<Object>(this, this) {
//                public Object doCall(Object it) {
//                    return DefaultGroovyMethods.invokeMethod(com.thoughtworks.selenium.Selenium, "initElements", new Object[]{(SearchContext) context, Tmp.this});
//                }
//
//                public Object doCall() {
//                    return doCall(null);
//                }
//
//            }, new Closure<Boolean>(this, this) {
//                public Boolean doCall(Object it) {
//                    return searchContext.text != null;
//                }
//
//                public Boolean doCall() {
//                    return doCall(null);
//                }
//
//            }});
//        } else {
//            invokeMethod(com.thoughtworks.selenium.Selenium, "initElements", new Object[]{(SearchContext) context, this});
//        }
//
//    }
//
//    public WebDriver getDriver() {
//        if (searchContext instanceof WebDriver) {
//            return ((WebDriver) (searchContext));
//        }
//
//
//        return ((WrapsDriver) searchContext).getWrappedDriver();
//    }
//
//    public SearchContext getSearchContext() {
//        return searchContext;
//    }
//
//    public void setSearchContext(SearchContext searchContext) {
//        this.searchContext = searchContext;
//    }
//
//    private SearchContext searchContext;
//}
