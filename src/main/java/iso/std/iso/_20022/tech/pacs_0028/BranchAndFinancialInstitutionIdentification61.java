package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6__1", propOrder = {
"finInstnId"
})
public class BranchAndFinancialInstitutionIdentification61 {
    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification181  finInstnId;

    public FinancialInstitutionIdentification181 getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinancialInstitutionIdentification181 finInstnId) {
        this.finInstnId = finInstnId;
    }
}
