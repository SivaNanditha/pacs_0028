package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupInformation29__1", propOrder = {
        "orgMsgId",
        "orgMsgNmId",
        "orgCreDtTm",
})
public class OriginalGroupInformation291 {
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgCreDtTm;

    public String getOrgMsgId() {
        return orgMsgId;
    }

    public void setOrgMsgId(String orgMsgId) {
        this.orgMsgId = orgMsgId;
    }

    public String getOrgMsgNmId() {
        return orgMsgNmId;
    }

    public void setOrgMsgNmId(String orgMsgNmId) {
        this.orgMsgNmId = orgMsgNmId;
    }

    public XMLGregorianCalendar getOrgCreDtTm() {
        return orgCreDtTm;
    }

    public void setOrgCreDtTm(XMLGregorianCalendar orgCreDtTm) {
        this.orgCreDtTm = orgCreDtTm;
    }
}
