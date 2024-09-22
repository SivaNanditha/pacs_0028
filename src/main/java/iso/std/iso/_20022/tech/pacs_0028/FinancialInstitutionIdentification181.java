package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification18__1", propOrder = {
 "clrSysMmbId"
})
public class FinancialInstitutionIdentification181 {
    @XmlElement(name = "ClrSysMmbId", required = true)
    protected ClearingSystemMemberIdentification21 clrSysMmbId;

    public ClearingSystemMemberIdentification21 getClrSysMmbId() {
        return clrSysMmbId;
    }

    public void setClrSysMmbId(ClearingSystemMemberIdentification21 clrSysMmbId) {
        this.clrSysMmbId = clrSysMmbId;
    }
}
