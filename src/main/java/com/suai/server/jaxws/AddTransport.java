
package com.suai.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addTransport", namespace = "http://server.suai.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTransport", namespace = "http://server.suai.com/")
public class AddTransport {

    @XmlElement(name = "arg0", namespace = "")
    private com.suai.server.Transport arg0;

    /**
     * 
     * @return
     *     returns Transport
     */
    public com.suai.server.Transport getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.suai.server.Transport arg0) {
        this.arg0 = arg0;
    }

}
