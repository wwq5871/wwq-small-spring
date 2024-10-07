package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;

/**
 * @author mikael wang
 * @date 2024/9/23 20:40
 */
public class BeanDefinition {

    private Class beanClass;
    private PropertyValues propertyValues;
    private String initMethodeName;
    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodeName() {
        return initMethodeName;
    }

    public void setInitMethodeName(String initMethodeName) {
        this.initMethodeName = initMethodeName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
