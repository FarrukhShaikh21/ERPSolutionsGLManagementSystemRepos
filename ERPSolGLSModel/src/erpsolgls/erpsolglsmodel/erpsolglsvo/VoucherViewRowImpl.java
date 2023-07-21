package erpsolgls.erpsolglsmodel.erpsolglsvo;

import erpsolgls.erpsolglsmodel.erpsolglseo.VoucherImpl;

import java.math.BigDecimal;


import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 17 14:04:08 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VoucherViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_VOUCHER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        VoucherNo,
        VoucherType,
        LocCode,
        VoucherDate,
        ChequeNo,
        ChequeDate,
        Particulars,
        Cash,
        Hold,
        Tax,
        Support,
        PrepareBy,
        PrepareDt,
        CheckBy,
        CheckDt,
        VerifyBy,
        VerifyDt,
        ApproveBy,
        ApproveDt,
        Bookid,
        Branchid,
        Bankid,
        AutoChequeNo,
        RefNo,
        SubmitVoucherNo,
        SubmitVoucherDate,
        Submit,
        SubmitBy,
        SubmitDate,
        GlVoucherType,
        AuditorCheck,
        AuditRemarks,
        IsMigrated,
        MigratedDate,
        ParticularsRescue,
        LocCurrcode,
        ExchangeRate,
        AuditRefNo,
        ProjectId,
        Lcno,
        ParticularsRescue2,
        OtfEx,
        RefDoctypeid,
        RefVoucherNo,
        Voucherseq,
        txtLocationName,
        GlVType,
        BankRefNo,
        VoucherDetView,
        VoucherDetView1,
        AllLocationsView,
        VoucherTypeView,
        AccVoucherView,
        AccVoucherTypeView,
        AccAllLocationsView,
        AccVWYesNoQVO;
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
    public static final int VOUCHERDATE = AttributesEnum.VoucherDate.index();
    public static final int CHEQUENO = AttributesEnum.ChequeNo.index();
    public static final int CHEQUEDATE = AttributesEnum.ChequeDate.index();
    public static final int PARTICULARS = AttributesEnum.Particulars.index();
    public static final int CASH = AttributesEnum.Cash.index();
    public static final int HOLD = AttributesEnum.Hold.index();
    public static final int TAX = AttributesEnum.Tax.index();
    public static final int SUPPORT = AttributesEnum.Support.index();
    public static final int PREPAREBY = AttributesEnum.PrepareBy.index();
    public static final int PREPAREDT = AttributesEnum.PrepareDt.index();
    public static final int CHECKBY = AttributesEnum.CheckBy.index();
    public static final int CHECKDT = AttributesEnum.CheckDt.index();
    public static final int VERIFYBY = AttributesEnum.VerifyBy.index();
    public static final int VERIFYDT = AttributesEnum.VerifyDt.index();
    public static final int APPROVEBY = AttributesEnum.ApproveBy.index();
    public static final int APPROVEDT = AttributesEnum.ApproveDt.index();
    public static final int BOOKID = AttributesEnum.Bookid.index();
    public static final int BRANCHID = AttributesEnum.Branchid.index();
    public static final int BANKID = AttributesEnum.Bankid.index();
    public static final int AUTOCHEQUENO = AttributesEnum.AutoChequeNo.index();
    public static final int REFNO = AttributesEnum.RefNo.index();
    public static final int SUBMITVOUCHERNO = AttributesEnum.SubmitVoucherNo.index();
    public static final int SUBMITVOUCHERDATE = AttributesEnum.SubmitVoucherDate.index();
    public static final int SUBMIT = AttributesEnum.Submit.index();
    public static final int SUBMITBY = AttributesEnum.SubmitBy.index();
    public static final int SUBMITDATE = AttributesEnum.SubmitDate.index();
    public static final int GLVOUCHERTYPE = AttributesEnum.GlVoucherType.index();
    public static final int AUDITORCHECK = AttributesEnum.AuditorCheck.index();
    public static final int AUDITREMARKS = AttributesEnum.AuditRemarks.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int PARTICULARSRESCUE = AttributesEnum.ParticularsRescue.index();
    public static final int LOCCURRCODE = AttributesEnum.LocCurrcode.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int AUDITREFNO = AttributesEnum.AuditRefNo.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int LCNO = AttributesEnum.Lcno.index();
    public static final int PARTICULARSRESCUE2 = AttributesEnum.ParticularsRescue2.index();
    public static final int OTFEX = AttributesEnum.OtfEx.index();
    public static final int REFDOCTYPEID = AttributesEnum.RefDoctypeid.index();
    public static final int REFVOUCHERNO = AttributesEnum.RefVoucherNo.index();
    public static final int VOUCHERSEQ = AttributesEnum.Voucherseq.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int GLVTYPE = AttributesEnum.GlVType.index();
    public static final int BANKREFNO = AttributesEnum.BankRefNo.index();
    public static final int VOUCHERDETVIEW = AttributesEnum.VoucherDetView.index();
    public static final int VOUCHERDETVIEW1 = AttributesEnum.VoucherDetView1.index();
    public static final int ALLLOCATIONSVIEW = AttributesEnum.AllLocationsView.index();
    public static final int VOUCHERTYPEVIEW = AttributesEnum.VoucherTypeView.index();
    public static final int ACCVOUCHERVIEW = AttributesEnum.AccVoucherView.index();
    public static final int ACCVOUCHERTYPEVIEW = AttributesEnum.AccVoucherTypeView.index();
    public static final int ACCALLLOCATIONSVIEW = AttributesEnum.AccAllLocationsView.index();
    public static final int ACCVWYESNOQVO = AttributesEnum.AccVWYesNoQVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VoucherViewRowImpl() {
    }

    /**
     * Gets Voucher entity object.
     * @return the Voucher
     */
    public VoucherImpl getVoucher() {
        return (VoucherImpl) getEntity(ENTITY_VOUCHER);
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
     * Gets the attribute value for VOUCHER_DATE using the alias name VoucherDate.
     * @return the VOUCHER_DATE
     */
    public Date getVoucherDate() {
        return (Date) getAttributeInternal(VOUCHERDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for VOUCHER_DATE using the alias name VoucherDate.
     * @param value value to set the VOUCHER_DATE
     */
    public void setVoucherDate(Date value) {
        setAttributeInternal(VOUCHERDATE, value);
    }

    /**
     * Gets the attribute value for CHEQUE_NO using the alias name ChequeNo.
     * @return the CHEQUE_NO
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as attribute value for CHEQUE_NO using the alias name ChequeNo.
     * @param value value to set the CHEQUE_NO
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for CHEQUE_DATE using the alias name ChequeDate.
     * @return the CHEQUE_DATE
     */
    public Date getChequeDate() {
        return (Date) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CHEQUE_DATE using the alias name ChequeDate.
     * @param value value to set the CHEQUE_DATE
     */
    public void setChequeDate(Date value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for PARTICULARS using the alias name Particulars.
     * @return the PARTICULARS
     */
    public String getParticulars() {
        return (String) getAttributeInternal(PARTICULARS);
    }

    /**
     * Sets <code>value</code> as attribute value for PARTICULARS using the alias name Particulars.
     * @param value value to set the PARTICULARS
     */
    public void setParticulars(String value) {
        setAttributeInternal(PARTICULARS, value);
    }

    /**
     * Gets the attribute value for CASH using the alias name Cash.
     * @return the CASH
     */
    public String getCash() {
        return (String) getAttributeInternal(CASH);
    }

    /**
     * Sets <code>value</code> as attribute value for CASH using the alias name Cash.
     * @param value value to set the CASH
     */
    public void setCash(String value) {
        setAttributeInternal(CASH, value);
    }

    /**
     * Gets the attribute value for HOLD using the alias name Hold.
     * @return the HOLD
     */
    public String getHold() {
        return (String) getAttributeInternal(HOLD);
    }

    /**
     * Sets <code>value</code> as attribute value for HOLD using the alias name Hold.
     * @param value value to set the HOLD
     */
    public void setHold(String value) {
        setAttributeInternal(HOLD, value);
    }

    /**
     * Gets the attribute value for TAX using the alias name Tax.
     * @return the TAX
     */
    public String getTax() {
        return (String) getAttributeInternal(TAX);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX using the alias name Tax.
     * @param value value to set the TAX
     */
    public void setTax(String value) {
        setAttributeInternal(TAX, value);
    }

    /**
     * Gets the attribute value for SUPPORT using the alias name Support.
     * @return the SUPPORT
     */
    public String getSupport() {
        return (String) getAttributeInternal(SUPPORT);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPORT using the alias name Support.
     * @param value value to set the SUPPORT
     */
    public void setSupport(String value) {
        setAttributeInternal(SUPPORT, value);
    }

    /**
     * Gets the attribute value for PREPARE_BY using the alias name PrepareBy.
     * @return the PREPARE_BY
     */
    public String getPrepareBy() {
        return (String) getAttributeInternal(PREPAREBY);
    }

    /**
     * Sets <code>value</code> as attribute value for PREPARE_BY using the alias name PrepareBy.
     * @param value value to set the PREPARE_BY
     */
    public void setPrepareBy(String value) {
        setAttributeInternal(PREPAREBY, value);
    }

    /**
     * Gets the attribute value for PREPARE_DT using the alias name PrepareDt.
     * @return the PREPARE_DT
     */
    public Date getPrepareDt() {
        return (Date) getAttributeInternal(PREPAREDT);
    }

    /**
     * Sets <code>value</code> as attribute value for PREPARE_DT using the alias name PrepareDt.
     * @param value value to set the PREPARE_DT
     */
    public void setPrepareDt(Date value) {
        setAttributeInternal(PREPAREDT, value);
    }

    /**
     * Gets the attribute value for CHECK_BY using the alias name CheckBy.
     * @return the CHECK_BY
     */
    public String getCheckBy() {
        return (String) getAttributeInternal(CHECKBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CHECK_BY using the alias name CheckBy.
     * @param value value to set the CHECK_BY
     */
    public void setCheckBy(String value) {
        setAttributeInternal(CHECKBY, value);
    }

    /**
     * Gets the attribute value for CHECK_DT using the alias name CheckDt.
     * @return the CHECK_DT
     */
    public Date getCheckDt() {
        return (Date) getAttributeInternal(CHECKDT);
    }

    /**
     * Sets <code>value</code> as attribute value for CHECK_DT using the alias name CheckDt.
     * @param value value to set the CHECK_DT
     */
    public void setCheckDt(Date value) {
        setAttributeInternal(CHECKDT, value);
    }

    /**
     * Gets the attribute value for VERIFY_BY using the alias name VerifyBy.
     * @return the VERIFY_BY
     */
    public String getVerifyBy() {
        return (String) getAttributeInternal(VERIFYBY);
    }

    /**
     * Sets <code>value</code> as attribute value for VERIFY_BY using the alias name VerifyBy.
     * @param value value to set the VERIFY_BY
     */
    public void setVerifyBy(String value) {
        setAttributeInternal(VERIFYBY, value);
    }

    /**
     * Gets the attribute value for VERIFY_DT using the alias name VerifyDt.
     * @return the VERIFY_DT
     */
    public Date getVerifyDt() {
        return (Date) getAttributeInternal(VERIFYDT);
    }

    /**
     * Sets <code>value</code> as attribute value for VERIFY_DT using the alias name VerifyDt.
     * @param value value to set the VERIFY_DT
     */
    public void setVerifyDt(Date value) {
        setAttributeInternal(VERIFYDT, value);
    }

    /**
     * Gets the attribute value for APPROVE_BY using the alias name ApproveBy.
     * @return the APPROVE_BY
     */
    public String getApproveBy() {
        return (String) getAttributeInternal(APPROVEBY);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVE_BY using the alias name ApproveBy.
     * @param value value to set the APPROVE_BY
     */
    public void setApproveBy(String value) {
        setAttributeInternal(APPROVEBY, value);
    }

    /**
     * Gets the attribute value for APPROVE_DT using the alias name ApproveDt.
     * @return the APPROVE_DT
     */
    public Date getApproveDt() {
        return (Date) getAttributeInternal(APPROVEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVE_DT using the alias name ApproveDt.
     * @param value value to set the APPROVE_DT
     */
    public void setApproveDt(Date value) {
        setAttributeInternal(APPROVEDT, value);
    }

    /**
     * Gets the attribute value for BOOKID using the alias name Bookid.
     * @return the BOOKID
     */
    public String getBookid() {
        return (String) getAttributeInternal(BOOKID);
    }

    /**
     * Sets <code>value</code> as attribute value for BOOKID using the alias name Bookid.
     * @param value value to set the BOOKID
     */
    public void setBookid(String value) {
        setAttributeInternal(BOOKID, value);
    }

    /**
     * Gets the attribute value for BRANCHID using the alias name Branchid.
     * @return the BRANCHID
     */
    public String getBranchid() {
        return (String) getAttributeInternal(BRANCHID);
    }

    /**
     * Sets <code>value</code> as attribute value for BRANCHID using the alias name Branchid.
     * @param value value to set the BRANCHID
     */
    public void setBranchid(String value) {
        setAttributeInternal(BRANCHID, value);
    }

    /**
     * Gets the attribute value for BANKID using the alias name Bankid.
     * @return the BANKID
     */
    public String getBankid() {
        return (String) getAttributeInternal(BANKID);
    }

    /**
     * Sets <code>value</code> as attribute value for BANKID using the alias name Bankid.
     * @param value value to set the BANKID
     */
    public void setBankid(String value) {
        setAttributeInternal(BANKID, value);
    }

    /**
     * Gets the attribute value for AUTO_CHEQUE_NO using the alias name AutoChequeNo.
     * @return the AUTO_CHEQUE_NO
     */
    public String getAutoChequeNo() {
        return (String) getAttributeInternal(AUTOCHEQUENO);
    }

    /**
     * Sets <code>value</code> as attribute value for AUTO_CHEQUE_NO using the alias name AutoChequeNo.
     * @param value value to set the AUTO_CHEQUE_NO
     */
    public void setAutoChequeNo(String value) {
        setAttributeInternal(AUTOCHEQUENO, value);
    }

    /**
     * Gets the attribute value for REF_NO using the alias name RefNo.
     * @return the REF_NO
     */
    public String getRefNo() {
        return (String) getAttributeInternal(REFNO);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_NO using the alias name RefNo.
     * @param value value to set the REF_NO
     */
    public void setRefNo(String value) {
        setAttributeInternal(REFNO, value);
    }

    /**
     * Gets the attribute value for SUBMIT_VOUCHER_NO using the alias name SubmitVoucherNo.
     * @return the SUBMIT_VOUCHER_NO
     */
    public String getSubmitVoucherNo() {
        return (String) getAttributeInternal(SUBMITVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMIT_VOUCHER_NO using the alias name SubmitVoucherNo.
     * @param value value to set the SUBMIT_VOUCHER_NO
     */
    public void setSubmitVoucherNo(String value) {
        setAttributeInternal(SUBMITVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for SUBMIT_VOUCHER_DATE using the alias name SubmitVoucherDate.
     * @return the SUBMIT_VOUCHER_DATE
     */
    public Date getSubmitVoucherDate() {
        return (Date) getAttributeInternal(SUBMITVOUCHERDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMIT_VOUCHER_DATE using the alias name SubmitVoucherDate.
     * @param value value to set the SUBMIT_VOUCHER_DATE
     */
    public void setSubmitVoucherDate(Date value) {
        setAttributeInternal(SUBMITVOUCHERDATE, value);
    }

    /**
     * Gets the attribute value for SUBMIT using the alias name Submit.
     * @return the SUBMIT
     */
    public String getSubmit() {
        return (String) getAttributeInternal(SUBMIT);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMIT using the alias name Submit.
     * @param value value to set the SUBMIT
     */
    public void setSubmit(String value) {
        setAttributeInternal(SUBMIT, value);
    }

    /**
     * Gets the attribute value for SUBMIT_BY using the alias name SubmitBy.
     * @return the SUBMIT_BY
     */
    public String getSubmitBy() {
        return (String) getAttributeInternal(SUBMITBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMIT_BY using the alias name SubmitBy.
     * @param value value to set the SUBMIT_BY
     */
    public void setSubmitBy(String value) {
        setAttributeInternal(SUBMITBY, value);
    }

    /**
     * Gets the attribute value for SUBMIT_DATE using the alias name SubmitDate.
     * @return the SUBMIT_DATE
     */
    public Date getSubmitDate() {
        return (Date) getAttributeInternal(SUBMITDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMIT_DATE using the alias name SubmitDate.
     * @param value value to set the SUBMIT_DATE
     */
    public void setSubmitDate(Date value) {
        setAttributeInternal(SUBMITDATE, value);
    }

    /**
     * Gets the attribute value for GL_VOUCHER_TYPE using the alias name GlVoucherType.
     * @return the GL_VOUCHER_TYPE
     */
    public String getGlVoucherType() {
        return (String) getAttributeInternal(GLVOUCHERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for GL_VOUCHER_TYPE using the alias name GlVoucherType.
     * @param value value to set the GL_VOUCHER_TYPE
     */
    public void setGlVoucherType(String value) {
        setAttributeInternal(GLVOUCHERTYPE, value);
    }

    /**
     * Gets the attribute value for AUDITOR_CHECK using the alias name AuditorCheck.
     * @return the AUDITOR_CHECK
     */
    public String getAuditorCheck() {
        return (String) getAttributeInternal(AUDITORCHECK);
    }

    /**
     * Sets <code>value</code> as attribute value for AUDITOR_CHECK using the alias name AuditorCheck.
     * @param value value to set the AUDITOR_CHECK
     */
    public void setAuditorCheck(String value) {
        setAttributeInternal(AUDITORCHECK, value);
    }

    /**
     * Gets the attribute value for AUDIT_REMARKS using the alias name AuditRemarks.
     * @return the AUDIT_REMARKS
     */
    public String getAuditRemarks() {
        return (String) getAttributeInternal(AUDITREMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for AUDIT_REMARKS using the alias name AuditRemarks.
     * @param value value to set the AUDIT_REMARKS
     */
    public void setAuditRemarks(String value) {
        setAttributeInternal(AUDITREMARKS, value);
    }

    /**
     * Gets the attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @return the IS_MIGRATED
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @param value value to set the IS_MIGRATED
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @return the MIGRATED_DATE
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @param value value to set the MIGRATED_DATE
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for PARTICULARS_RESCUE using the alias name ParticularsRescue.
     * @return the PARTICULARS_RESCUE
     */
    public String getParticularsRescue() {
        return (String) getAttributeInternal(PARTICULARSRESCUE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARTICULARS_RESCUE using the alias name ParticularsRescue.
     * @param value value to set the PARTICULARS_RESCUE
     */
    public void setParticularsRescue(String value) {
        setAttributeInternal(PARTICULARSRESCUE, value);
    }

    /**
     * Gets the attribute value for LOC_CURRCODE using the alias name LocCurrcode.
     * @return the LOC_CURRCODE
     */
    public String getLocCurrcode() {
        return (String) getAttributeInternal(LOCCURRCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOC_CURRCODE using the alias name LocCurrcode.
     * @param value value to set the LOC_CURRCODE
     */
    public void setLocCurrcode(String value) {
        setAttributeInternal(LOCCURRCODE, value);
    }

    /**
     * Gets the attribute value for EXCHANGE_RATE using the alias name ExchangeRate.
     * @return the EXCHANGE_RATE
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EXCHANGE_RATE using the alias name ExchangeRate.
     * @param value value to set the EXCHANGE_RATE
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for AUDIT_REF_NO using the alias name AuditRefNo.
     * @return the AUDIT_REF_NO
     */
    public String getAuditRefNo() {
        return (String) getAttributeInternal(AUDITREFNO);
    }

    /**
     * Sets <code>value</code> as attribute value for AUDIT_REF_NO using the alias name AuditRefNo.
     * @param value value to set the AUDIT_REF_NO
     */
    public void setAuditRefNo(String value) {
        setAttributeInternal(AUDITREFNO, value);
    }

    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for LCNO using the alias name Lcno.
     * @return the LCNO
     */
    public String getLcno() {
        return (String) getAttributeInternal(LCNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LCNO using the alias name Lcno.
     * @param value value to set the LCNO
     */
    public void setLcno(String value) {
        setAttributeInternal(LCNO, value);
    }

    /**
     * Gets the attribute value for PARTICULARS_RESCUE_2 using the alias name ParticularsRescue2.
     * @return the PARTICULARS_RESCUE_2
     */
    public String getParticularsRescue2() {
        return (String) getAttributeInternal(PARTICULARSRESCUE2);
    }

    /**
     * Sets <code>value</code> as attribute value for PARTICULARS_RESCUE_2 using the alias name ParticularsRescue2.
     * @param value value to set the PARTICULARS_RESCUE_2
     */
    public void setParticularsRescue2(String value) {
        setAttributeInternal(PARTICULARSRESCUE2, value);
    }

    /**
     * Gets the attribute value for OTF_EX using the alias name OtfEx.
     * @return the OTF_EX
     */
    public String getOtfEx() {
        return (String) getAttributeInternal(OTFEX);
    }

    /**
     * Sets <code>value</code> as attribute value for OTF_EX using the alias name OtfEx.
     * @param value value to set the OTF_EX
     */
    public void setOtfEx(String value) {
        setAttributeInternal(OTFEX, value);
    }

    /**
     * Gets the attribute value for REF_DOCTYPEID using the alias name RefDoctypeid.
     * @return the REF_DOCTYPEID
     */
    public String getRefDoctypeid() {
        return (String) getAttributeInternal(REFDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_DOCTYPEID using the alias name RefDoctypeid.
     * @param value value to set the REF_DOCTYPEID
     */
    public void setRefDoctypeid(String value) {
        setAttributeInternal(REFDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for REF_VOUCHER_NO using the alias name RefVoucherNo.
     * @return the REF_VOUCHER_NO
     */
    public String getRefVoucherNo() {
        return (String) getAttributeInternal(REFVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_VOUCHER_NO using the alias name RefVoucherNo.
     * @param value value to set the REF_VOUCHER_NO
     */
    public void setRefVoucherNo(String value) {
        setAttributeInternal(REFVOUCHERNO, value);
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
     * Gets the attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @return the TXT_LOCATION_NAME
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @param value value to set the TXT_LOCATION_NAME
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for GL_V_TYPE using the alias name GlVType.
     * @return the GL_V_TYPE
     */
    public String getGlVType() {
        return (String) getAttributeInternal(GLVTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for GL_V_TYPE using the alias name GlVType.
     * @param value value to set the GL_V_TYPE
     */
    public void setGlVType(String value) {
        setAttributeInternal(GLVTYPE, value);
    }

    /**
     * Gets the attribute value for BANK_REF_NO using the alias name BankRefNo.
     * @return the BANK_REF_NO
     */
    public String getBankRefNo() {
        return (String) getAttributeInternal(BANKREFNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BANK_REF_NO using the alias name BankRefNo.
     * @param value value to set the BANK_REF_NO
     */
    public void setBankRefNo(String value) {
        setAttributeInternal(BANKREFNO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VoucherDetView.
     */
    public RowIterator getVoucherDetView() {
        return (RowIterator) getAttributeInternal(VOUCHERDETVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VoucherDetView1.
     */
    public RowIterator getVoucherDetView1() {
        return (RowIterator) getAttributeInternal(VOUCHERDETVIEW1);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AllLocationsView.
     */
    public Row getAllLocationsView() {
        return (Row) getAttributeInternal(ALLLOCATIONSVIEW);
    }

    /**
     * Sets the master-detail link AllLocationsView between this object and <code>value</code>.
     */
    public void setAllLocationsView(Row value) {
        setAttributeInternal(ALLLOCATIONSVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link VoucherTypeView.
     */
    public Row getVoucherTypeView() {
        return (Row) getAttributeInternal(VOUCHERTYPEVIEW);
    }

    /**
     * Sets the master-detail link VoucherTypeView between this object and <code>value</code>.
     */
    public void setVoucherTypeView(Row value) {
        setAttributeInternal(VOUCHERTYPEVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVoucherView.
     */
    public RowSet getAccVoucherView() {
        return (RowSet) getAttributeInternal(ACCVOUCHERVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVoucherTypeView.
     */
    public RowSet getAccVoucherTypeView() {
        return (RowSet) getAttributeInternal(ACCVOUCHERTYPEVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsView.
     */
    public RowSet getAccAllLocationsView() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWYesNoQVO.
     */
    public RowSet getAccVWYesNoQVO() {
        return (RowSet) getAttributeInternal(ACCVWYESNOQVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getSubmit().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

