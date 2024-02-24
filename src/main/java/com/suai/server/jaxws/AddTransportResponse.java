
package com.suai.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addTransportResponse", namespace = "http://server.suai.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTransportResponse", namespace = "http://server.suai.com/")
public class AddTransportResponse {

    @XmlElement(name = "return", namespace = "")
    private com.suai.server.Transport _return;

    /**
     * 
     * @return
     *     returns Transport
     */
    public com.suai.server.Transport getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.suai.server.Transport _return) {
        this._return = _return;
    }

}
