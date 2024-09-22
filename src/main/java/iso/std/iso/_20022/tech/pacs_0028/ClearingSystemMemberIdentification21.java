package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentification2__1", propOrder = {
"clrSysIdf", "mmbId"
})
public class ClearingSystemMemberIdentification21 {
    @XmlElement(name = "ClrSysId", required = true)
    protected ClearingSystemIdentification2Choice1b clrSysIdf;

    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;

    public ClearingSystemIdentification2Choice1b getClrSysIdf() {
        return clrSysIdf;
    }

    public void setClrSysIdf(ClearingSystemIdentification2Choice1b clrSysIdf) {
        this.clrSysIdf = clrSysIdf;
    }

    public String getMmbId() {
        return mmbId;
    }

    public void setMmbId(String mmbId) {
        this.mmbId = mmbId;
    }
}
