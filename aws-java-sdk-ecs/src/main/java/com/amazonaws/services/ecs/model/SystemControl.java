/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in the <a
 * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the <a
 * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code> option to <a
 * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
 * </p>
 * <note>
 * <p>
 * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple containers
 * in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. When you do, the
 * container that is started last will determine which <code>systemControls</code> parameters take effect.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SystemControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespaced kernel parameter to set a <code>value</code> for.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The namespaced kernel parameter to set a <code>value</code> for.
     * </p>
     * 
     * @param namespace
     *        The namespaced kernel parameter to set a <code>value</code> for.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespaced kernel parameter to set a <code>value</code> for.
     * </p>
     * 
     * @return The namespaced kernel parameter to set a <code>value</code> for.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespaced kernel parameter to set a <code>value</code> for.
     * </p>
     * 
     * @param namespace
     *        The namespaced kernel parameter to set a <code>value</code> for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemControl withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     * </p>
     * 
     * @param value
     *        The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     * </p>
     * 
     * @return The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     * </p>
     * 
     * @param value
     *        The value for the namespaced kernel parameter specifed in <code>namespace</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemControl withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemControl == false)
            return false;
        SystemControl other = (SystemControl) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SystemControl clone() {
        try {
            return (SystemControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.SystemControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
