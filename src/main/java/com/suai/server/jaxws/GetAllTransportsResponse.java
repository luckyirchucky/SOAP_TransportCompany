
package com.suai.server.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllTransportsResponse", namespace = "http://server.suai.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllTransportsResponse", namespace = "http://server.suai.com/")
public class GetAllTransportsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.suai.server.Transport> _return;

    /**
     * 
     * @return
     *     returns List<Transport>
     */
    public List<com.suai.server.Transport> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.suai.server.Transport> _return) {
        this._return = _return;
    }

}
