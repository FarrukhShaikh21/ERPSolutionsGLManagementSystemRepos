package erpsolgls.erpsolglsmodel.erpsolglsvo;

import erpsolgls.erpsolglsmodel.erpsolglseo.VoucherDetImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 16 22:03:02 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VoucherDetViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_VOUCHERDET = 0;

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
        txtGLCode,
        txtGLCodeCredit,
        txtGLCodeCreditDescription,
        txtGlDescription,
        txtGLType,
        ChartOfAccView,
        CostCenterView,
        AccVWChartOfAccountQVO,
        AccVWCostCenterQVO;
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
    public static final int TXTGLCODE = AttributesEnum.txtGLCode.index();
    public static final int TXTGLCODECREDIT = AttributesEnum.txtGLCodeCredit.index();
    public static final int TXTGLCODECREDITDESCRIPTION = AttributesEnum.txtGLCodeCreditDescription.index();
    public static final int TXTGLDESCRIPTION = AttributesEnum.txtGlDescription.index();
    public static final int TXTGLTYPE = AttributesEnum.txtGLType.index();
    public static final int CHARTOFACCVIEW = AttributesEnum.ChartOfAccView.index();
    public static final int COSTCENTERVIEW = AttributesEnum.CostCenterView.index();
    public static final int ACCVWCHARTOFACCOUNTQVO = AttributesEnum.AccVWChartOfAccountQVO.index();
    public static final int ACCVWCOSTCENTERQVO = AttributesEnum.AccVWCostCenterQVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VoucherDetViewRowImpl() {
    }

    /**
     * Gets VoucherDet entity object.
     * @return the VoucherDet
     */
    public VoucherDetImpl getVoucherDet() {
        return (VoucherDetImpl) getEntity(ENTITY_VOUCHERDET);
    }

    /**
     * Gets the attribute value for VOUCHER_NO using the alias name VoucherNo.
     * @return the VOUCHER_NO
     */
    public String getVoucherNo() {
        return (String) getAttributeInternal(VOUCHERNO);
    }

    /**
     * Sets <code>value</code> as attribute value for VOUCHER_NO using the alias name VoucherNo.
     * @param value value to set the VOUCHER_NO
     */
    public void setVoucherNo(String value) {
        setAttributeInternal(VOUCHERNO, value);
    }

    /**
     * Gets the attribute value for VOUCHER_TYPE using the alias name VoucherType.
     * @return the VOUCHER_TYPE
     */
    public String getVoucherType() {
        return (String) getAttributeInternal(VOUCHERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for VOUCHER_TYPE using the alias name VoucherType.
     * @param value value to set the VOUCHER_TYPE
     */
    public void setVoucherType(String value) {
        setAttributeInternal(VOUCHERTYPE, value);
    }

    /**
     * Gets the attribute value for LOC_CODE using the alias name LocCode.
     * @return the LOC_CODE
     */
    public String getLocCode() {
        return (String) getAttributeInternal(LOCCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOC_CODE using the alias name LocCode.
     * @param value value to set the LOC_CODE
     */
    public void setLocCode(String value) {
        setAttributeInternal(LOCCODE, value);
    }

    /**
     * Gets the attribute value for GLNATURE_OF_A_C using the alias name GlnatureOfAC.
     * @return the GLNATURE_OF_A_C
     */
    public String getGlnatureOfAC() {
        return (String) getAttributeInternal(GLNATUREOFAC);
    }

    /**
     * Sets <code>value</code> as attribute value for GLNATURE_OF_A_C using the alias name GlnatureOfAC.
     * @param value value to set the GLNATURE_OF_A_C
     */
    public void setGlnatureOfAC(String value) {
        setAttributeInternal(GLNATUREOFAC, value);
    }

    /**
     * Gets the attribute value for GLBROAD_CATEGORY using the alias name GlbroadCategory.
     * @return the GLBROAD_CATEGORY
     */
    public String getGlbroadCategory() {
        return (String) getAttributeInternal(GLBROADCATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for GLBROAD_CATEGORY using the alias name GlbroadCategory.
     * @param value value to set the GLBROAD_CATEGORY
     */
    public void setGlbroadCategory(String value) {
        setAttributeInternal(GLBROADCATEGORY, value);
    }

    /**
     * Gets the attribute value for GLCONTROL_A_C using the alias name GlcontrolAC.
     * @return the GLCONTROL_A_C
     */
    public String getGlcontrolAC() {
        return (String) getAttributeInternal(GLCONTROLAC);
    }

    /**
     * Sets <code>value</code> as attribute value for GLCONTROL_A_C using the alias name GlcontrolAC.
     * @param value value to set the GLCONTROL_A_C
     */
    public void setGlcontrolAC(String value) {
        setAttributeInternal(GLCONTROLAC, value);
    }

    /**
     * Gets the attribute value for GLSUB_CONTROL_A_C using the alias name GlsubControlAC.
     * @return the GLSUB_CONTROL_A_C
     */
    public String getGlsubControlAC() {
        return (String) getAttributeInternal(GLSUBCONTROLAC);
    }

    /**
     * Sets <code>value</code> as attribute value for GLSUB_CONTROL_A_C using the alias name GlsubControlAC.
     * @param value value to set the GLSUB_CONTROL_A_C
     */
    public void setGlsubControlAC(String value) {
        setAttributeInternal(GLSUBCONTROLAC, value);
    }

    /**
     * Gets the attribute value for GLSUBSIDARY_A_C using the alias name GlsubsidaryAC.
     * @return the GLSUBSIDARY_A_C
     */
    public String getGlsubsidaryAC() {
        return (String) getAttributeInternal(GLSUBSIDARYAC);
    }

    /**
     * Sets <code>value</code> as attribute value for GLSUBSIDARY_A_C using the alias name GlsubsidaryAC.
     * @param value value to set the GLSUBSIDARY_A_C
     */
    public void setGlsubsidaryAC(String value) {
        setAttributeInternal(GLSUBSIDARYAC, value);
    }

    /**
     * Gets the attribute value for CCREGION using the alias name Ccregion.
     * @return the CCREGION
     */
    public String getCcregion() {
        return (String) getAttributeInternal(CCREGION);
    }

    /**
     * Sets <code>value</code> as attribute value for CCREGION using the alias name Ccregion.
     * @param value value to set the CCREGION
     */
    public void setCcregion(String value) {
        setAttributeInternal(CCREGION, value);
    }

    /**
     * Gets the attribute value for CCSUB_LOCATION using the alias name CcsubLocation.
     * @return the CCSUB_LOCATION
     */
    public String getCcsubLocation() {
        return (String) getAttributeInternal(CCSUBLOCATION);
    }

    /**
     * Sets <code>value</code> as attribute value for CCSUB_LOCATION using the alias name CcsubLocation.
     * @param value value to set the CCSUB_LOCATION
     */
    public void setCcsubLocation(String value) {
        setAttributeInternal(CCSUBLOCATION, value);
    }

    /**
     * Gets the attribute value for CCSUBSIDARY using the alias name Ccsubsidary.
     * @return the CCSUBSIDARY
     */
    public String getCcsubsidary() {
        return (String) getAttributeInternal(CCSUBSIDARY);
    }

    /**
     * Sets <code>value</code> as attribute value for CCSUBSIDARY using the alias name Ccsubsidary.
     * @param value value to set the CCSUBSIDARY
     */
    public void setCcsubsidary(String value) {
        setAttributeInternal(CCSUBSIDARY, value);
    }

    /**
     * Gets the attribute value for DEBIT using the alias name Debit.
     * @return the DEBIT
     */
    public BigDecimal getDebit() {
        return (BigDecimal) getAttributeInternal(DEBIT);
    }

    /**
     * Sets <code>value</code> as attribute value for DEBIT using the alias name Debit.
     * @param value value to set the DEBIT
     */
    public void setDebit(BigDecimal value) {
        setAttributeInternal(DEBIT, value);
    }

    /**
     * Gets the attribute value for CREDIT using the alias name Credit.
     * @return the CREDIT
     */
    public BigDecimal getCredit() {
        return (BigDecimal) getAttributeInternal(CREDIT);
    }

    /**
     * Sets <code>value</code> as attribute value for CREDIT using the alias name Credit.
     * @param value value to set the CREDIT
     */
    public void setCredit(BigDecimal value) {
        setAttributeInternal(CREDIT, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for NARRATION using the alias name Narration.
     * @return the NARRATION
     */
    public String getNarration() {
        return (String) getAttributeInternal(NARRATION);
    }

    /**
     * Sets <code>value</code> as attribute value for NARRATION using the alias name Narration.
     * @param value value to set the NARRATION
     */
    public void setNarration(String value) {
        setAttributeInternal(NARRATION, value);
    }

    /**
     * Gets the attribute value for S_NO using the alias name SNo.
     * @return the S_NO
     */
    public String getSNo() {
        return (String) getAttributeInternal(SNO);
    }

    /**
     * Sets <code>value</code> as attribute value for S_NO using the alias name SNo.
     * @param value value to set the S_NO
     */
    public void setSNo(String value) {
        setAttributeInternal(SNO, value);
    }

    /**
     * Gets the attribute value for TRN_LOC_CODE using the alias name TrnLocCode.
     * @return the TRN_LOC_CODE
     */
    public String getTrnLocCode() {
        return (String) getAttributeInternal(TRNLOCCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRN_LOC_CODE using the alias name TrnLocCode.
     * @param value value to set the TRN_LOC_CODE
     */
    public void setTrnLocCode(String value) {
        setAttributeInternal(TRNLOCCODE, value);
    }

    /**
     * Gets the attribute value for OLD_GLCODE using the alias name OldGlcode.
     * @return the OLD_GLCODE
     */
    public String getOldGlcode() {
        return (String) getAttributeInternal(OLDGLCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for OLD_GLCODE using the alias name OldGlcode.
     * @param value value to set the OLD_GLCODE
     */
    public void setOldGlcode(String value) {
        setAttributeInternal(OLDGLCODE, value);
    }

    /**
     * Gets the attribute value for NARRATION_RESCUE using the alias name NarrationRescue.
     * @return the NARRATION_RESCUE
     */
    public String getNarrationRescue() {
        return (String) getAttributeInternal(NARRATIONRESCUE);
    }

    /**
     * Sets <code>value</code> as attribute value for NARRATION_RESCUE using the alias name NarrationRescue.
     * @param value value to set the NARRATION_RESCUE
     */
    public void setNarrationRescue(String value) {
        setAttributeInternal(NARRATIONRESCUE, value);
    }

    /**
     * Gets the attribute value for FCURR_DEBIT using the alias name FcurrDebit.
     * @return the FCURR_DEBIT
     */
    public BigDecimal getFcurrDebit() {
        
        BigDecimal bd=(BigDecimal) getAttributeInternal(FCURRDEBIT);
        
        return bd;
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_DEBIT using the alias name FcurrDebit.
     * @param value value to set the FCURR_DEBIT
     */
    public void setFcurrDebit(BigDecimal value) {
        setAttributeInternal(FCURRDEBIT, value);
    }

    /**
     * Gets the attribute value for FCURR_CREDIT using the alias name FcurrCredit.
     * @return the FCURR_CREDIT
     */
    public BigDecimal getFcurrCredit() {
        BigDecimal bd=(BigDecimal) getAttributeInternal(FCURRCREDIT);
        return bd;
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_CREDIT using the alias name FcurrCredit.
     * @param value value to set the FCURR_CREDIT
     */
    public void setFcurrCredit(BigDecimal value) {
        
        setAttributeInternal(FCURRCREDIT, value);
    }

    /**
     * Gets the attribute value for NARRATION_RESCUE_2 using the alias name NarrationRescue2.
     * @return the NARRATION_RESCUE_2
     */
    public String getNarrationRescue2() {
        return (String) getAttributeInternal(NARRATIONRESCUE2);
    }

    /**
     * Sets <code>value</code> as attribute value for NARRATION_RESCUE_2 using the alias name NarrationRescue2.
     * @param value value to set the NARRATION_RESCUE_2
     */
    public void setNarrationRescue2(String value) {
        setAttributeInternal(NARRATIONRESCUE2, value);
    }

    /**
     * Gets the attribute value for VOUCHERSEQ using the alias name Voucherseq.
     * @return the VOUCHERSEQ
     */
    public Integer getVoucherseq() {
        return (Integer) getAttributeInternal(VOUCHERSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for VOUCHERSEQ using the alias name Voucherseq.
     * @param value value to set the VOUCHERSEQ
     */
    public void setVoucherseq(Integer value) {
        setAttributeInternal(VOUCHERSEQ, value);
    }

    /**
     * Gets the attribute value for VOUCHERDETSEQ using the alias name Voucherdetseq.
     * @return the VOUCHERDETSEQ
     */
    public Integer getVoucherdetseq() {
        return (Integer) getAttributeInternal(VOUCHERDETSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for VOUCHERDETSEQ using the alias name Voucherdetseq.
     * @param value value to set the VOUCHERDETSEQ
     */
    public void setVoucherdetseq(Integer value) {
        setAttributeInternal(VOUCHERDETSEQ, value);
    }

    /**
     * Gets the attribute value for TXT_COST_CENTER using the alias name txtCostCenter.
     * @return the TXT_COST_CENTER
     */
    public String gettxtCostCenter() {
        return (String) getAttributeInternal(TXTCOSTCENTER);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_COST_CENTER using the alias name txtCostCenter.
     * @param value value to set the TXT_COST_CENTER
     */
    public void settxtCostCenter(String value) {
        setAttributeInternal(TXTCOSTCENTER, value);
    }

    /**
     * Gets the attribute value for TXT_COST_CENTER_DESCRIPTION using the alias name txtCostCenterDescription.
     * @return the TXT_COST_CENTER_DESCRIPTION
     */
    public String gettxtCostCenterDescription() {
        return (String) getAttributeInternal(TXTCOSTCENTERDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_COST_CENTER_DESCRIPTION using the alias name txtCostCenterDescription.
     * @param value value to set the TXT_COST_CENTER_DESCRIPTION
     */
    public void settxtCostCenterDescription(String value) {
        setAttributeInternal(TXTCOSTCENTERDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for TXT_GLCODE using the alias name txtGLCode.
     * @return the TXT_GLCODE
     */
    public String gettxtGLCode() {
        return (String) getAttributeInternal(TXTGLCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GLCODE using the alias name txtGLCode.
     * @param value value to set the TXT_GLCODE
     */
    public void settxtGLCode(String value) {
        System.out.println("Debit");
        setFcurrCredit(null);
        setAttributeInternal(TXTGLCODE, value);
    }

    /**
     * Gets the attribute value for TXT_GLCODE_CREDIT using the alias name txtGLCodeCredit.
     * @return the TXT_GLCODE_CREDIT
     */
    public String gettxtGLCodeCredit() {
        return (String) getAttributeInternal(TXTGLCODECREDIT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GLCODE_CREDIT using the alias name txtGLCodeCredit.
     * @param value value to set the TXT_GLCODE_CREDIT
     */
    public void settxtGLCodeCredit(String value) {
        System.out.println("Credit");
        setFcurrDebit(null);
        setAttributeInternal(TXTGLCODECREDIT, value);
    }

    /**
     * Gets the attribute value for TXT_GLCODE_CREDIT_DESCRIPTION using the alias name txtGLCodeCreditDescription.
     * @return the TXT_GLCODE_CREDIT_DESCRIPTION
     */
    public String gettxtGLCodeCreditDescription() {
        return (String) getAttributeInternal(TXTGLCODECREDITDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GLCODE_CREDIT_DESCRIPTION using the alias name txtGLCodeCreditDescription.
     * @param value value to set the TXT_GLCODE_CREDIT_DESCRIPTION
     */
    public void settxtGLCodeCreditDescription(String value) {
        settxtGLType("C");
        setAttributeInternal(TXTGLCODECREDITDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for TXT_GL_DESCRIPTION using the alias name txtGlDescription.
     * @return the TXT_GL_DESCRIPTION
     */
    public String gettxtGlDescription() {
        return (String) getAttributeInternal(TXTGLDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GL_DESCRIPTION using the alias name txtGlDescription.
     * @param value value to set the TXT_GL_DESCRIPTION
     */
    public void settxtGlDescription(String value) {
        settxtGLType("D");
        setAttributeInternal(TXTGLDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for TXT_GLTYPE using the alias name txtGLType.
     * @return the TXT_GLTYPE
     */
    public String gettxtGLType() {
        return (String) getAttributeInternal(TXTGLTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GLTYPE using the alias name txtGLType.
     * @param value value to set the TXT_GLTYPE
     */
    public void settxtGLType(String value) {
        setAttributeInternal(TXTGLTYPE, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ChartOfAccView.
     */
    public Row getChartOfAccView() {
        return (Row) getAttributeInternal(CHARTOFACCVIEW);
    }

    /**
     * Sets the master-detail link ChartOfAccView between this object and <code>value</code>.
     */
    public void setChartOfAccView(Row value) {
        setAttributeInternal(CHARTOFACCVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link CostCenterView.
     */
    public Row getCostCenterView() {
        return (Row) getAttributeInternal(COSTCENTERVIEW);
    }

    /**
     * Sets the master-detail link CostCenterView between this object and <code>value</code>.
     */
    public void setCostCenterView(Row value) {
        setAttributeInternal(COSTCENTERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWChartOfAccountQVO.
     */
    public RowSet getAccVWChartOfAccountQVO() {
        return (RowSet) getAttributeInternal(ACCVWCHARTOFACCOUNTQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWCostCenterQVO.
     */
    public RowSet getAccVWCostCenterQVO() {
        return (RowSet) getAttributeInternal(ACCVWCOSTCENTERQVO);
    }
}

