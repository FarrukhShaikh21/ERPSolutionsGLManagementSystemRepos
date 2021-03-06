package erpsolgls.erpsolglsmodel.erpsolglseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 16 14:27:08 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VoucherDetImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        VoucherNo,
        VoucherType,
        LocCode,
        GlnatureOfAC,
        GlbroadCategory,
        GlcontrolAC,
        GlsubControlAC,
        GlsubsidaryAC,
        Ccregion,
        CcsubLocation,
        Ccsubsidary,
        Debit,
        Credit,
        Quantity,
        Narration,
        SNo,
        TrnLocCode,
        OldGlcode,
        NarrationRescue,
        FcurrDebit,
        FcurrCredit,
        NarrationRescue2,
        Voucherseq,
        Voucherdetseq,
        txtCostCenter,
        txtCostCenterDescription,
        txtGlDescription,
        txtGLCodeCreditDescription,
        DebitGlCode,
        CreditGlCode,
        Voucher,
        Voucher1,
        ChartOfAcc,
        CostCenter;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int VOUCHERNO = AttributesEnum.VoucherNo.index();
    public static final int VOUCHERTYPE = AttributesEnum.VoucherType.index();
    public static final int LOCCODE = AttributesEnum.LocCode.index();
    public static final int GLNATUREOFAC = AttributesEnum.GlnatureOfAC.index();
    public static final int GLBROADCATEGORY = AttributesEnum.GlbroadCategory.index();
    public static final int GLCONTROLAC = AttributesEnum.GlcontrolAC.index();
    public static final int GLSUBCONTROLAC = AttributesEnum.GlsubControlAC.index();
    public static final int GLSUBSIDARYAC = AttributesEnum.GlsubsidaryAC.index();
    public static final int CCREGION = AttributesEnum.Ccregion.index();
    public static final int CCSUBLOCATION = AttributesEnum.CcsubLocation.index();
    public static final int CCSUBSIDARY = AttributesEnum.Ccsubsidary.index();
    public static final int DEBIT = AttributesEnum.Debit.index();
    public static final int CREDIT = AttributesEnum.Credit.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int NARRATION = AttributesEnum.Narration.index();
    public static final int SNO = AttributesEnum.SNo.index();
    public static final int TRNLOCCODE = AttributesEnum.TrnLocCode.index();
    public static final int OLDGLCODE = AttributesEnum.OldGlcode.index();
    public static final int NARRATIONRESCUE = AttributesEnum.NarrationRescue.index();
    public static final int FCURRDEBIT = AttributesEnum.FcurrDebit.index();
    public static final int FCURRCREDIT = AttributesEnum.FcurrCredit.index();
    public static final int NARRATIONRESCUE2 = AttributesEnum.NarrationRescue2.index();
    public static final int VOUCHERSEQ = AttributesEnum.Voucherseq.index();
    public static final int VOUCHERDETSEQ = AttributesEnum.Voucherdetseq.index();
    public static final int TXTCOSTCENTER = AttributesEnum.txtCostCenter.index();
    public static final int TXTCOSTCENTERDESCRIPTION = AttributesEnum.txtCostCenterDescription.index();
    public static final int TXTGLDESCRIPTION = AttributesEnum.txtGlDescription.index();
    public static final int TXTGLCODECREDITDESCRIPTION = AttributesEnum.txtGLCodeCreditDescription.index();
    public static final int DEBITGLCODE = AttributesEnum.DebitGlCode.index();
    public static final int CREDITGLCODE = AttributesEnum.CreditGlCode.index();
    public static final int VOUCHER = AttributesEnum.Voucher.index();
    public static final int VOUCHER1 = AttributesEnum.Voucher1.index();
    public static final int CHARTOFACC = AttributesEnum.ChartOfAcc.index();
    public static final int COSTCENTER = AttributesEnum.CostCenter.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VoucherDetImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolgls.erpsolglsmodel.erpsolglseo.VoucherDet");
    }


    /**
     * Gets the attribute value for VoucherNo, using the alias name VoucherNo.
     * @return the value of VoucherNo
     */
    public String getVoucherNo() {
        return (String) getAttributeInternal(VOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherNo.
     * @param value value to set the VoucherNo
     */
    public void setVoucherNo(String value) {
        setAttributeInternal(VOUCHERNO, value);
    }

    /**
     * Gets the attribute value for VoucherType, using the alias name VoucherType.
     * @return the value of VoucherType
     */
    public String getVoucherType() {
        return (String) getAttributeInternal(VOUCHERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherType.
     * @param value value to set the VoucherType
     */
    public void setVoucherType(String value) {
        setAttributeInternal(VOUCHERTYPE, value);
    }

    /**
     * Gets the attribute value for LocCode, using the alias name LocCode.
     * @return the value of LocCode
     */
    public String getLocCode() {
        return (String) getAttributeInternal(LOCCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocCode.
     * @param value value to set the LocCode
     */
    public void setLocCode(String value) {
        setAttributeInternal(LOCCODE, value);
    }

    /**
     * Gets the attribute value for GlnatureOfAC, using the alias name GlnatureOfAC.
     * @return the value of GlnatureOfAC
     */
    public String getGlnatureOfAC() {
        return (String) getAttributeInternal(GLNATUREOFAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlnatureOfAC.
     * @param value value to set the GlnatureOfAC
     */
    public void setGlnatureOfAC(String value) {
        setAttributeInternal(GLNATUREOFAC, value);
    }

    /**
     * Gets the attribute value for GlbroadCategory, using the alias name GlbroadCategory.
     * @return the value of GlbroadCategory
     */
    public String getGlbroadCategory() {
        return (String) getAttributeInternal(GLBROADCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlbroadCategory.
     * @param value value to set the GlbroadCategory
     */
    public void setGlbroadCategory(String value) {
        setAttributeInternal(GLBROADCATEGORY, value);
    }

    /**
     * Gets the attribute value for GlcontrolAC, using the alias name GlcontrolAC.
     * @return the value of GlcontrolAC
     */
    public String getGlcontrolAC() {
        return (String) getAttributeInternal(GLCONTROLAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlcontrolAC.
     * @param value value to set the GlcontrolAC
     */
    public void setGlcontrolAC(String value) {
        setAttributeInternal(GLCONTROLAC, value);
    }

    /**
     * Gets the attribute value for GlsubControlAC, using the alias name GlsubControlAC.
     * @return the value of GlsubControlAC
     */
    public String getGlsubControlAC() {
        return (String) getAttributeInternal(GLSUBCONTROLAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlsubControlAC.
     * @param value value to set the GlsubControlAC
     */
    public void setGlsubControlAC(String value) {
        setAttributeInternal(GLSUBCONTROLAC, value);
    }

    /**
     * Gets the attribute value for GlsubsidaryAC, using the alias name GlsubsidaryAC.
     * @return the value of GlsubsidaryAC
     */
    public String getGlsubsidaryAC() {
        return (String) getAttributeInternal(GLSUBSIDARYAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlsubsidaryAC.
     * @param value value to set the GlsubsidaryAC
     */
    public void setGlsubsidaryAC(String value) {
        setAttributeInternal(GLSUBSIDARYAC, value);
    }

    /**
     * Gets the attribute value for Ccregion, using the alias name Ccregion.
     * @return the value of Ccregion
     */
    public String getCcregion() {
        return (String) getAttributeInternal(CCREGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ccregion.
     * @param value value to set the Ccregion
     */
    public void setCcregion(String value) {
        setAttributeInternal(CCREGION, value);
    }

    /**
     * Gets the attribute value for CcsubLocation, using the alias name CcsubLocation.
     * @return the value of CcsubLocation
     */
    public String getCcsubLocation() {
        return (String) getAttributeInternal(CCSUBLOCATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcsubLocation.
     * @param value value to set the CcsubLocation
     */
    public void setCcsubLocation(String value) {
        setAttributeInternal(CCSUBLOCATION, value);
    }

    /**
     * Gets the attribute value for Ccsubsidary, using the alias name Ccsubsidary.
     * @return the value of Ccsubsidary
     */
    public String getCcsubsidary() {
        return (String) getAttributeInternal(CCSUBSIDARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ccsubsidary.
     * @param value value to set the Ccsubsidary
     */
    public void setCcsubsidary(String value) {
        setAttributeInternal(CCSUBSIDARY, value);
    }

    /**
     * Gets the attribute value for Debit, using the alias name Debit.
     * @return the value of Debit
     */
    public BigDecimal getDebit() {
        return (BigDecimal) getAttributeInternal(DEBIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Debit.
     * @param value value to set the Debit
     */
    public void setDebit(BigDecimal value) {
        setAttributeInternal(DEBIT, value);
    }

    /**
     * Gets the attribute value for Credit, using the alias name Credit.
     * @return the value of Credit
     */
    public BigDecimal getCredit() {
        return (BigDecimal) getAttributeInternal(CREDIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Credit.
     * @param value value to set the Credit
     */
    public void setCredit(BigDecimal value) {
        setAttributeInternal(CREDIT, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for Narration, using the alias name Narration.
     * @return the value of Narration
     */
    public String getNarration() {
        return (String) getAttributeInternal(NARRATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Narration.
     * @param value value to set the Narration
     */
    public void setNarration(String value) {
        setAttributeInternal(NARRATION, value);
    }

    /**
     * Gets the attribute value for SNo, using the alias name SNo.
     * @return the value of SNo
     */
    public String getSNo() {
        return (String) getAttributeInternal(SNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SNo.
     * @param value value to set the SNo
     */
    public void setSNo(String value) {
        setAttributeInternal(SNO, value);
    }

    /**
     * Gets the attribute value for TrnLocCode, using the alias name TrnLocCode.
     * @return the value of TrnLocCode
     */
    public String getTrnLocCode() {
        return (String) getAttributeInternal(TRNLOCCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrnLocCode.
     * @param value value to set the TrnLocCode
     */
    public void setTrnLocCode(String value) {
        setAttributeInternal(TRNLOCCODE, value);
    }

    /**
     * Gets the attribute value for OldGlcode, using the alias name OldGlcode.
     * @return the value of OldGlcode
     */
    public String getOldGlcode() {
        return (String) getAttributeInternal(OLDGLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OldGlcode.
     * @param value value to set the OldGlcode
     */
    public void setOldGlcode(String value) {
        setAttributeInternal(OLDGLCODE, value);
    }

    /**
     * Gets the attribute value for NarrationRescue, using the alias name NarrationRescue.
     * @return the value of NarrationRescue
     */
    public String getNarrationRescue() {
        return (String) getAttributeInternal(NARRATIONRESCUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NarrationRescue.
     * @param value value to set the NarrationRescue
     */
    public void setNarrationRescue(String value) {
        setAttributeInternal(NARRATIONRESCUE, value);
    }

    /**
     * Gets the attribute value for FcurrDebit, using the alias name FcurrDebit.
     * @return the value of FcurrDebit
     */
    public BigDecimal getFcurrDebit() {
        return (BigDecimal) getAttributeInternal(FCURRDEBIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrDebit.
     * @param value value to set the FcurrDebit
     */
    public void setFcurrDebit(BigDecimal value) {
        setAttributeInternal(FCURRDEBIT, value);
    }

    /**
     * Gets the attribute value for FcurrCredit, using the alias name FcurrCredit.
     * @return the value of FcurrCredit
     */
    public BigDecimal getFcurrCredit() {
        return (BigDecimal) getAttributeInternal(FCURRCREDIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrCredit.
     * @param value value to set the FcurrCredit
     */
    public void setFcurrCredit(BigDecimal value) {
        setAttributeInternal(FCURRCREDIT, value);
    }

    /**
     * Gets the attribute value for NarrationRescue2, using the alias name NarrationRescue2.
     * @return the value of NarrationRescue2
     */
    public String getNarrationRescue2() {
        return (String) getAttributeInternal(NARRATIONRESCUE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for NarrationRescue2.
     * @param value value to set the NarrationRescue2
     */
    public void setNarrationRescue2(String value) {
        setAttributeInternal(NARRATIONRESCUE2, value);
    }

    /**
     * Gets the attribute value for Voucherseq, using the alias name Voucherseq.
     * @return the value of Voucherseq
     */
    public Integer getVoucherseq() {
        return (Integer) getAttributeInternal(VOUCHERSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Voucherseq.
     * @param value value to set the Voucherseq
     */
    public void setVoucherseq(Integer value) {
        setAttributeInternal(VOUCHERSEQ, value);
    }

    /**
     * Gets the attribute value for Voucherdetseq, using the alias name Voucherdetseq.
     * @return the value of Voucherdetseq
     */
    public Integer getVoucherdetseq() {
        return (Integer) getAttributeInternal(VOUCHERDETSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Voucherdetseq.
     * @param value value to set the Voucherdetseq
     */
    public void setVoucherdetseq(Integer value) {
        setAttributeInternal(VOUCHERDETSEQ, value);
    }

    /**
     * Gets the attribute value for txtCostCenter, using the alias name txtCostCenter.
     * @return the value of txtCostCenter
     */
    public String gettxtCostCenter() {
        return (String) getAttributeInternal(TXTCOSTCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCostCenter.
     * @param value value to set the txtCostCenter
     */
    public void settxtCostCenter(String value) {
        setAttributeInternal(TXTCOSTCENTER, value);
    }

    /**
     * Gets the attribute value for txtCostCenterDescription, using the alias name txtCostCenterDescription.
     * @return the value of txtCostCenterDescription
     */
    public String gettxtCostCenterDescription() {
        return (String) getAttributeInternal(TXTCOSTCENTERDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCostCenterDescription.
     * @param value value to set the txtCostCenterDescription
     */
    public void settxtCostCenterDescription(String value) {
        setAttributeInternal(TXTCOSTCENTERDESCRIPTION, value);
    }


    /**
     * Gets the attribute value for txtGlDescription, using the alias name txtGlDescription.
     * @return the value of txtGlDescription
     */
    public String gettxtGlDescription() {
        return (String) getAttributeInternal(TXTGLDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGlDescription.
     * @param value value to set the txtGlDescription
     */
    public void settxtGlDescription(String value) {
        setAttributeInternal(TXTGLDESCRIPTION, value);
    }


    /**
     * Gets the attribute value for txtGLCodeCreditDescription, using the alias name txtGLCodeCreditDescription.
     * @return the value of txtGLCodeCreditDescription
     */
    public String gettxtGLCodeCreditDescription() {
        return (String) getAttributeInternal(TXTGLCODECREDITDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGLCodeCreditDescription.
     * @param value value to set the txtGLCodeCreditDescription
     */
    public void settxtGLCodeCreditDescription(String value) {
        setAttributeInternal(TXTGLCODECREDITDESCRIPTION, value);
    }


    /**
     * Gets the attribute value for DebitGlCode, using the alias name DebitGlCode.
     * @return the value of DebitGlCode
     */
    public String getDebitGlCode() {
        return (String) getAttributeInternal(DEBITGLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DebitGlCode.
     * @param value value to set the DebitGlCode
     */
    public void setDebitGlCode(String value) {
        setAttributeInternal(DEBITGLCODE, value);
    }

    /**
     * Gets the attribute value for CreditGlCode, using the alias name CreditGlCode.
     * @return the value of CreditGlCode
     */
    public String getCreditGlCode() {
        return (String) getAttributeInternal(CREDITGLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreditGlCode.
     * @param value value to set the CreditGlCode
     */
    public void setCreditGlCode(String value) {
        setAttributeInternal(CREDITGLCODE, value);
    }

    /**
     * @return the associated entity VoucherImpl.
     */
    public VoucherImpl getVoucher() {
        return (VoucherImpl) getAttributeInternal(VOUCHER);
    }

    /**
     * Sets <code>value</code> as the associated entity VoucherImpl.
     */
    public void setVoucher(VoucherImpl value) {
        setAttributeInternal(VOUCHER, value);
    }

    /**
     * @return the associated entity VoucherImpl.
     */
    public VoucherImpl getVoucher1() {
        return (VoucherImpl) getAttributeInternal(VOUCHER1);
    }

    /**
     * Sets <code>value</code> as the associated entity VoucherImpl.
     */
    public void setVoucher1(VoucherImpl value) {
        setAttributeInternal(VOUCHER1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getChartOfAcc() {
        return (EntityImpl) getAttributeInternal(CHARTOFACC);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setChartOfAcc(EntityImpl value) {
        setAttributeInternal(CHARTOFACC, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getCostCenter() {
        return (EntityImpl) getAttributeInternal(COSTCENTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setCostCenter(EntityImpl value) {
        setAttributeInternal(COSTCENTER, value);
    }


    /**
     * @param voucherdetseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer voucherdetseq) {
        return new Key(new Object[] { voucherdetseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Voucherdetseq");
        setERPSolPKSeqName("voucher_det_seq");
        setTrnLocCode(ERPSolGlobClassModel.doGetUserLocationCode());
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
           populateAttributeAsChanged(VOUCHERNO, getVoucher().getAttribute("VoucherNo").toString()); 
           populateAttributeAsChanged(LOCCODE, getVoucher().getAttribute("LocCode").toString()); 
           populateAttributeAsChanged(VOUCHERTYPE, getVoucher().getAttribute("VoucherType").toString()); 
           String pkValue="FUNC_GET_MAX_ID('VOUCHER_DET WHERE VOUCHER_TYPE=''"+getVoucherType()+"'' AND VOUCHER_NO=''"+getVoucherNo()+"'' AND LOC_CODE=''"+getLocCode()+"''','TO_NUMBER(S_NO)')";
           System.out.println(pkValue);
           String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
           populateAttributeAsChanged(SNO, result);

       }
        if (operation!=DML_DELETE) {
           populateAttributeAsChanged(DEBIT, getFcurrDebit()); 
           populateAttributeAsChanged(CREDIT, getFcurrCredit()); 
       }
      
//        populateAttributeAsChanged(SALESORDERID, getSoSalesOrder().getAttribute("Salesorderid").toString());
          
        super.doDML(operation, e);
    }
}

