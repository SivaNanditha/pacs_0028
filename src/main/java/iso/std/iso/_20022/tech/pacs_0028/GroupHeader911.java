package iso.std.iso._20022.tech.pacs_0028;


import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "GroupHeader91__1", propOrder = {
  "msdId", "credDtTm"
})
public class GroupHeader911 {
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar credDtTm;

    public XMLGregorianCalendar getCredDtTm() {
        return credDtTm;
    }

    public void setCredDtTm(XMLGregorianCalendar credDtTm) {
        this.credDtTm = credDtTm;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgId() {
        return msgId;
    }


}