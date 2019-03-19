package com.bigstudent.common.util;

import com.bigstudent.common.exception.BigStudentException;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/6
 */
public class ConverterUtils {

    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass)  {
        if (map == null){
            return null;
        }
        Object obj = null;
        try{
            obj = beanClass.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                Method setter = property.getWriteMethod();
                if (setter != null) {
                    setter.invoke(obj, map.get(property.getName()));
                }
            }
        }catch (Exception e){
            throw BigStudentException.systemException(e);
        }
         return obj;
     }

             /* public static Map<String, Object> objectToMap(Object obj) throws Exception {
                 if(obj == null)
                         return null;

                 Map<String, Object> map = new HashMap<String, Object>();

                 BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
                 PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                 for (PropertyDescriptor property : propertyDescriptors) {
                         String key = property.getName();
                         if (key.compareToIgnoreCase("class") == 0) {
                                 continue;
                             }
                         Method getter = property.getReadMethod();
                         Object value = getter!=null ? getter.invoke(obj) : null;
                         map.put(key, value);
                     }

                 return map;
             }*/
}
