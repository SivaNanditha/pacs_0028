package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "FIToFIPaymntStsReq"
})
public class Document {

    @XmlElement(name = "FIToFIPmtStsReq", required = true)
    protected FIToFIPaymentStatusRequestV03 FIToFIPaymntStsReq;

    public FIToFIPaymentStatusRequestV03 getFIToFIPaymntStsReq() {
        return FIToFIPaymntStsReq;
    }

    public void setFIToFIPaymntStsReq(FIToFIPaymentStatusRequestV03 FIToFIPaymntStsReq) {
        this.FIToFIPaymntStsReq = FIToFIPaymntStsReq;
    }


}
