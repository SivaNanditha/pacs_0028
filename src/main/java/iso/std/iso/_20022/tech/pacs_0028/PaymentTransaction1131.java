package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction113__1", propOrder = {
        "orgGrpInf", "orgInstrId", "orgEToEId", "orgTxId",
        "orgUETR", "BrnchFinInstgAgt", "BrnchFinInstdAgt"
})
public class PaymentTransaction1131 {
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation291 orgGrpInf;
    //if min and max esthey required particular kadhu
    @XmlElement(name = "OrgnlInstrId")
    protected String orgInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgEToEId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgTxId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgUETR;
    @XmlElement(name = "InstgAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification61 BrnchFinInstgAgt;
    @XmlElement(name = "InstdAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification61 BrnchFinInstdAgt;

    public OriginalGroupInformation291 getOrgGrpInf() {
        return orgGrpInf;
    }

    public void setOrgGrpInf(OriginalGroupInformation291 orgGrpInf) {
        this.orgGrpInf = orgGrpInf;
    }

    public String getOrgInstrId() {
        return orgInstrId;
    }

    public void setOrgInstrId(String orgInstrId) {
        this.orgInstrId = orgInstrId;
    }

    public String getOrgEToEId() {
        return orgEToEId;
    }

    public void setOrgEToEId(String orgEToEId) {
        this.orgEToEId = orgEToEId;
    }

    public String getOrgTxId() {
        return orgTxId;
    }

    public void setOrgTxId(String orgTxId) {
        this.orgTxId = orgTxId;
    }

    public String getOrgUETR() {
        return orgUETR;
    }

    public void setOrgUETR(String orgUETR) {
        this.orgUETR = orgUETR;
    }

    public BranchAndFinancialInstitutionIdentification61 getBrnchFinInstgAgt() {
        return BrnchFinInstgAgt;
    }

    public void setBrnchFinInstgAgt(BranchAndFinancialInstitutionIdentification61 brnchFinInstgAgt) {
        BrnchFinInstgAgt = brnchFinInstgAgt;
    }

    public BranchAndFinancialInstitutionIdentification61 getBrnchFinInstdAgt() {
        return BrnchFinInstdAgt;
    }

    public void setBrnchFinInstdAgt(BranchAndFinancialInstitutionIdentification61 brnchFinInstdAgt) {
        BrnchFinInstdAgt = brnchFinInstdAgt;
    }
}