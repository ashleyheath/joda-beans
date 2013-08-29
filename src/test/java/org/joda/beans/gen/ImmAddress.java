/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.BasicImmutableBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock address JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class ImmAddress implements ImmutableBean {

    /**
     * The number.
     * This will be the flat, house number or house name.
     */
    @PropertyDefinition
    private final int number;
    /**
     * The street.
     */
    @PropertyDefinition(validate = "notNull")
    private final String street;
    /**
     * The city.
     */
    @PropertyDefinition(validate = "notNull")
    private final String city;
    /** 
     * The owner.
     */
    @PropertyDefinition(validate = "notNull")
    private final ImmPerson owner;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmAddress}.
     * @return the meta-bean, not null
     */
    public static ImmAddress.Meta meta() {
        return ImmAddress.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmAddress.Meta.INSTANCE);
    }

    /**
     * Returns a builder used tp create an instance of the bean.
     *
     * @return the builder, not null
     */
    public static ImmAddress.Builder builder() {
        return new ImmAddress.Builder();
    }

    private ImmAddress(
            ImmAddress.Builder builder,
            int number,
            String street,
            String city,
            ImmPerson owner) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.owner = owner;
    }

    @Override
    public ImmAddress.Meta metaBean() {
        return ImmAddress.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * This will be the flat, house number or house name.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    /**
     * Gets the the {@code number} property.
     * This will be the flat, house number or house name.
     * @return the property, not null
     */
    public final Property<Integer> number() {
        return metaBean().number().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the street.
     * @return the value of the property, not null
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the the {@code street} property.
     * @return the property, not null
     */
    public final Property<String> street() {
        return metaBean().street().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property, not null
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the the {@code city} property.
     * @return the property, not null
     */
    public final Property<String> city() {
        return metaBean().city().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the owner.
     * @return the value of the property, not null
     */
    public ImmPerson getOwner() {
        return owner;
    }

    /**
     * Gets the the {@code owner} property.
     * @return the property, not null
     */
    public final Property<ImmPerson> owner() {
        return metaBean().owner().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder with() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmAddress other = (ImmAddress) obj;
            return (getNumber() == other.getNumber()) &&
                    JodaBeanUtils.equal(getStreet(), other.getStreet()) &&
                    JodaBeanUtils.equal(getCity(), other.getCity()) &&
                    JodaBeanUtils.equal(getOwner(), other.getOwner());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash += hash * 31 + JodaBeanUtils.hashCode(getStreet());
        hash += hash * 31 + JodaBeanUtils.hashCode(getCity());
        hash += hash * 31 + JodaBeanUtils.hashCode(getOwner());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(160);
        buf.append(getClass().getSimpleName());
        buf.append('{');
        buf.append("number").append('=').append(getNumber()).append(',').append(' ');
        buf.append("street").append('=').append(getStreet()).append(',').append(' ');
        buf.append("city").append('=').append(getCity()).append(',').append(' ');
        buf.append("owner").append('=').append(getOwner());
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmAddress}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code number} property.
         */
        private final MetaProperty<Integer> number = DirectMetaProperty.ofReadOnly(
                this, "number", ImmAddress.class, Integer.TYPE);
        /**
         * The meta-property for the {@code street} property.
         */
        private final MetaProperty<String> street = DirectMetaProperty.ofReadOnly(
                this, "street", ImmAddress.class, String.class);
        /**
         * The meta-property for the {@code city} property.
         */
        private final MetaProperty<String> city = DirectMetaProperty.ofReadOnly(
                this, "city", ImmAddress.class, String.class);
        /**
         * The meta-property for the {@code owner} property.
         */
        private final MetaProperty<ImmPerson> owner = DirectMetaProperty.ofReadOnly(
                this, "owner", ImmAddress.class, ImmPerson.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "number",
                "street",
                "city",
                "owner");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case -891990013:  // street
                    return street;
                case 3053931:  // city
                    return city;
                case 106164915:  // owner
                    return owner;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmAddress.Builder builder() {
            return new ImmAddress.Builder();
        }

        @Override
        public Class<? extends ImmAddress> beanType() {
            return ImmAddress.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code number} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> number() {
            return number;
        }

        /**
         * The meta-property for the {@code street} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> street() {
            return street;
        }

        /**
         * The meta-property for the {@code city} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> city() {
            return city;
        }

        /**
         * The meta-property for the {@code owner} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<ImmPerson> owner() {
            return owner;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return ((ImmAddress) bean).getNumber();
                case -891990013:  // street
                    return ((ImmAddress) bean).getStreet();
                case 3053931:  // city
                    return ((ImmAddress) bean).getCity();
                case 106164915:  // owner
                    return ((ImmAddress) bean).getOwner();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmAddress}.
     */
    public static class Builder extends BasicImmutableBeanBuilder<ImmAddress> {

        private int number;
        private String street;
        private String city;
        private ImmPerson owner;

        /**
         * Restricted constructor.
         */
        private Builder() {
            super(ImmAddress.Meta.INSTANCE);
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmAddress beanToCopy) {
            super(ImmAddress.Meta.INSTANCE);
            this.number = beanToCopy.getNumber();
            this.street = beanToCopy.getStreet();
            this.city = beanToCopy.getCity();
            this.owner = beanToCopy.getOwner();
        }

        //-----------------------------------------------------------------------
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (Integer) newValue;
                    break;
                case -891990013:  // street
                    this.street = (String) newValue;
                    break;
                case 3053931:  // city
                    this.city = (String) newValue;
                    break;
                case 106164915:  // owner
                    this.owner = (ImmPerson) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public ImmAddress build() {
            return new ImmAddress(
                    this,
                    number,
                    street,
                    city,
                    owner);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the {@code number} property in the builder.
         * @param newValue  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder number(int newValue) {
            this.number = newValue;
            return this;
        }

        /**
         * Sets the {@code street} property in the builder.
         * @param newValue  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder street(String newValue) {
            this.street = newValue;
            return this;
        }

        /**
         * Sets the {@code city} property in the builder.
         * @param newValue  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder city(String newValue) {
            this.city = newValue;
            return this;
        }

        /**
         * Sets the {@code owner} property in the builder.
         * @param newValue  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder owner(ImmPerson newValue) {
            this.owner = newValue;
            return this;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}