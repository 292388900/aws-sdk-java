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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBrokerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Required. The unique ID that Amazon MQ generates for the broker. */
    private String brokerId;
    /** The ID of the updated configuration. */
    private ConfigurationId configuration;

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * The ID of the updated configuration.
     * 
     * @param configuration
     *        The ID of the updated configuration.
     */

    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    /**
     * The ID of the updated configuration.
     * 
     * @return The ID of the updated configuration.
     */

    public ConfigurationId getConfiguration() {
        return this.configuration;
    }

    /**
     * The ID of the updated configuration.
     * 
     * @param configuration
     *        The ID of the updated configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withConfiguration(ConfigurationId configuration) {
        setConfiguration(configuration);
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBrokerResult == false)
            return false;
        UpdateBrokerResult other = (UpdateBrokerResult) obj;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBrokerResult clone() {
        try {
            return (UpdateBrokerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
