package iso.std.iso._20022.tech.pacs_0028;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemIdentification2Choice__1", propOrder = {
"clrSysIdf2C1b"
})
public class ClearingSystemIdentification2Choice1b {
    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalClearingSystemIdentification1Codefixed clrSysIdf2C1b;

    public ExternalClearingSystemIdentification1Codefixed getClrSysIdf2C1b() {
        return clrSysIdf2C1b;
    }

    public void setClrSysIdf2C1b(ExternalClearingSystemIdentification1Codefixed clrSysIdf2C1b) {
        this.clrSysIdf2C1b = clrSysIdf2C1b;
    }
}
