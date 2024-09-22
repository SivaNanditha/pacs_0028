package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIToFIPaymentStatusRequestV03", propOrder = {
        "grpHdr", "pmtTranstcn"
})
public class FIToFIPaymentStatusRequestV03 {
    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader911 grpHdr;
    @XmlElement(name = "TxInf", required = true)
    protected PaymentTransaction1131 pmtTranstcn;

    public GroupHeader911 getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GroupHeader911 grpHdr) {
        this.grpHdr = grpHdr;

    }

    public PaymentTransaction1131 getPmtTranstcn() {
        return pmtTranstcn;
    }

    public void setPmtTranstcn(PaymentTransaction1131 pmtTranstcn) {
        this.pmtTranstcn = pmtTranstcn;
    }
}
