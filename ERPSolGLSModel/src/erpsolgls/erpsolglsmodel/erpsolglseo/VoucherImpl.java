package erpsolgls.erpsolglsmodel.erpsolglseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.sql.Types;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 16 14:24:13 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VoucherImpl extends ERPSolGlobalsEntityImpl {
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
        txtGLVTYPE,
        VoucherDet,
        VoucherDet1,
        AllLocations;
        private static AttributesEnum[] vals = null;
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
    public static final int TXTGLVTYPE = AttributesEnum.txtGLVTYPE.index();
    public static final int VOUCHERDET = AttributesEnum.VoucherDet.index();
    public static final int VOUCHERDET1 = AttributesEnum.VoucherDet1.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VoucherImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolgls.erpsolglsmodel.erpsolglseo.Voucher");
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
     * Gets the attribute value for VoucherDate, using the alias name VoucherDate.
     * @return the value of VoucherDate
     */
    public Date getVoucherDate() {
        return (Date) getAttributeInternal(VOUCHERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherDate.
     * @param value value to set the VoucherDate
     */
    public void setVoucherDate(Date value) {
        setAttributeInternal(VOUCHERDATE, value);
    }

    /**
     * Gets the attribute value for ChequeNo, using the alias name ChequeNo.
     * @return the value of ChequeNo
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeNo.
     * @param value value to set the ChequeNo
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for ChequeDate, using the alias name ChequeDate.
     * @return the value of ChequeDate
     */
    public Date getChequeDate() {
        return (Date) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeDate.
     * @param value value to set the ChequeDate
     */
    public void setChequeDate(Date value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for Particulars, using the alias name Particulars.
     * @return the value of Particulars
     */
    public String getParticulars() {
        return (String) getAttributeInternal(PARTICULARS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Particulars.
     * @param value value to set the Particulars
     */
    public void setParticulars(String value) {
        setAttributeInternal(PARTICULARS, value);
    }

    /**
     * Gets the attribute value for Cash, using the alias name Cash.
     * @return the value of Cash
     */
    public String getCash() {
        return (String) getAttributeInternal(CASH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cash.
     * @param value value to set the Cash
     */
    public void setCash(String value) {
        setAttributeInternal(CASH, value);
    }

    /**
     * Gets the attribute value for Hold, using the alias name Hold.
     * @return the value of Hold
     */
    public String getHold() {
        return (String) getAttributeInternal(HOLD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Hold.
     * @param value value to set the Hold
     */
    public void setHold(String value) {
        setAttributeInternal(HOLD, value);
    }

    /**
     * Gets the attribute value for Tax, using the alias name Tax.
     * @return the value of Tax
     */
    public String getTax() {
        return (String) getAttributeInternal(TAX);
    }

    /**
     * Sets <code>value</code> as the attribute value for Tax.
     * @param value value to set the Tax
     */
    public void setTax(String value) {
        setAttributeInternal(TAX, value);
    }

    /**
     * Gets the attribute value for Support, using the alias name Support.
     * @return the value of Support
     */
    public String getSupport() {
        return (String) getAttributeInternal(SUPPORT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Support.
     * @param value value to set the Support
     */
    public void setSupport(String value) {
        setAttributeInternal(SUPPORT, value);
    }

    /**
     * Gets the attribute value for PrepareBy, using the alias name PrepareBy.
     * @return the value of PrepareBy
     */
    public String getPrepareBy() {
        return (String) getAttributeInternal(PREPAREBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrepareBy.
     * @param value value to set the PrepareBy
     */
    public void setPrepareBy(String value) {
        setAttributeInternal(PREPAREBY, value);
    }

    /**
     * Gets the attribute value for PrepareDt, using the alias name PrepareDt.
     * @return the value of PrepareDt
     */
    public Date getPrepareDt() {
        return (Date) getAttributeInternal(PREPAREDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrepareDt.
     * @param value value to set the PrepareDt
     */
    public void setPrepareDt(Date value) {
        setAttributeInternal(PREPAREDT, value);
    }

    /**
     * Gets the attribute value for CheckBy, using the alias name CheckBy.
     * @return the value of CheckBy
     */
    public String getCheckBy() {
        return (String) getAttributeInternal(CHECKBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CheckBy.
     * @param value value to set the CheckBy
     */
    public void setCheckBy(String value) {
        setAttributeInternal(CHECKBY, value);
    }

    /**
     * Gets the attribute value for CheckDt, using the alias name CheckDt.
     * @return the value of CheckDt
     */
    public Date getCheckDt() {
        return (Date) getAttributeInternal(CHECKDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CheckDt.
     * @param value value to set the CheckDt
     */
    public void setCheckDt(Date value) {
        setAttributeInternal(CHECKDT, value);
    }

    /**
     * Gets the attribute value for VerifyBy, using the alias name VerifyBy.
     * @return the value of VerifyBy
     */
    public String getVerifyBy() {
        return (String) getAttributeInternal(VERIFYBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for VerifyBy.
     * @param value value to set the VerifyBy
     */
    public void setVerifyBy(String value) {
        setAttributeInternal(VERIFYBY, value);
    }

    /**
     * Gets the attribute value for VerifyDt, using the alias name VerifyDt.
     * @return the value of VerifyDt
     */
    public Date getVerifyDt() {
        return (Date) getAttributeInternal(VERIFYDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for VerifyDt.
     * @param value value to set the VerifyDt
     */
    public void setVerifyDt(Date value) {
        setAttributeInternal(VERIFYDT, value);
    }

    /**
     * Gets the attribute value for ApproveBy, using the alias name ApproveBy.
     * @return the value of ApproveBy
     */
    public String getApproveBy() {
        return (String) getAttributeInternal(APPROVEBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApproveBy.
     * @param value value to set the ApproveBy
     */
    public void setApproveBy(String value) {
        setAttributeInternal(APPROVEBY, value);
    }

    /**
     * Gets the attribute value for ApproveDt, using the alias name ApproveDt.
     * @return the value of ApproveDt
     */
    public Date getApproveDt() {
        return (Date) getAttributeInternal(APPROVEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApproveDt.
     * @param value value to set the ApproveDt
     */
    public void setApproveDt(Date value) {
        setAttributeInternal(APPROVEDT, value);
    }

    /**
     * Gets the attribute value for Bookid, using the alias name Bookid.
     * @return the value of Bookid
     */
    public String getBookid() {
        return (String) getAttributeInternal(BOOKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bookid.
     * @param value value to set the Bookid
     */
    public void setBookid(String value) {
        setAttributeInternal(BOOKID, value);
    }

    /**
     * Gets the attribute value for Branchid, using the alias name Branchid.
     * @return the value of Branchid
     */
    public String getBranchid() {
        return (String) getAttributeInternal(BRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Branchid.
     * @param value value to set the Branchid
     */
    public void setBranchid(String value) {
        setAttributeInternal(BRANCHID, value);
    }

    /**
     * Gets the attribute value for Bankid, using the alias name Bankid.
     * @return the value of Bankid
     */
    public String getBankid() {
        return (String) getAttributeInternal(BANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bankid.
     * @param value value to set the Bankid
     */
    public void setBankid(String value) {
        setAttributeInternal(BANKID, value);
    }

    /**
     * Gets the attribute value for AutoChequeNo, using the alias name AutoChequeNo.
     * @return the value of AutoChequeNo
     */
    public String getAutoChequeNo() {
        return (String) getAttributeInternal(AUTOCHEQUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for AutoChequeNo.
     * @param value value to set the AutoChequeNo
     */
    public void setAutoChequeNo(String value) {
        setAttributeInternal(AUTOCHEQUENO, value);
    }

    /**
     * Gets the attribute value for RefNo, using the alias name RefNo.
     * @return the value of RefNo
     */
    public String getRefNo() {
        return (String) getAttributeInternal(REFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefNo.
     * @param value value to set the RefNo
     */
    public void setRefNo(String value) {
        setAttributeInternal(REFNO, value);
    }

    /**
     * Gets the attribute value for SubmitVoucherNo, using the alias name SubmitVoucherNo.
     * @return the value of SubmitVoucherNo
     */
    public String getSubmitVoucherNo() {
        return (String) getAttributeInternal(SUBMITVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitVoucherNo.
     * @param value value to set the SubmitVoucherNo
     */
    public void setSubmitVoucherNo(String value) {
        setAttributeInternal(SUBMITVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for SubmitVoucherDate, using the alias name SubmitVoucherDate.
     * @return the value of SubmitVoucherDate
     */
    public Timestamp getSubmitVoucherDate() {
        return (Timestamp) getAttributeInternal(SUBMITVOUCHERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitVoucherDate.
     * @param value value to set the SubmitVoucherDate
     */
    public void setSubmitVoucherDate(Timestamp value) {
        setAttributeInternal(SUBMITVOUCHERDATE, value);
    }

    /**
     * Gets the attribute value for Submit, using the alias name Submit.
     * @return the value of Submit
     */
    public String getSubmit() {
        return (String) getAttributeInternal(SUBMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Submit.
     * @param value value to set the Submit
     */
    public void setSubmit(String value) {
        setAttributeInternal(SUBMIT, value);
    }

    /**
     * Gets the attribute value for SubmitBy, using the alias name SubmitBy.
     * @return the value of SubmitBy
     */
    public String getSubmitBy() {
        return (String) getAttributeInternal(SUBMITBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitBy.
     * @param value value to set the SubmitBy
     */
    public void setSubmitBy(String value) {
        setAttributeInternal(SUBMITBY, value);
    }

    /**
     * Gets the attribute value for SubmitDate, using the alias name SubmitDate.
     * @return the value of SubmitDate
     */
    public Date getSubmitDate() {
        return (Date) getAttributeInternal(SUBMITDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitDate.
     * @param value value to set the SubmitDate
     */
    public void setSubmitDate(Date value) {
        setAttributeInternal(SUBMITDATE, value);
    }

    /**
     * Gets the attribute value for GlVoucherType, using the alias name GlVoucherType.
     * @return the value of GlVoucherType
     */
    public String getGlVoucherType() {
        return (String) getAttributeInternal(GLVOUCHERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlVoucherType.
     * @param value value to set the GlVoucherType
     */
    public void setGlVoucherType(String value) {
        setAttributeInternal(GLVOUCHERTYPE, value);
    }

    /**
     * Gets the attribute value for AuditorCheck, using the alias name AuditorCheck.
     * @return the value of AuditorCheck
     */
    public String getAuditorCheck() {
        return (String) getAttributeInternal(AUDITORCHECK);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuditorCheck.
     * @param value value to set the AuditorCheck
     */
    public void setAuditorCheck(String value) {
        setAttributeInternal(AUDITORCHECK, value);
    }

    /**
     * Gets the attribute value for AuditRemarks, using the alias name AuditRemarks.
     * @return the value of AuditRemarks
     */
    public String getAuditRemarks() {
        return (String) getAttributeInternal(AUDITREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuditRemarks.
     * @param value value to set the AuditRemarks
     */
    public void setAuditRemarks(String value) {
        setAttributeInternal(AUDITREMARKS, value);
    }

    /**
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for ParticularsRescue, using the alias name ParticularsRescue.
     * @return the value of ParticularsRescue
     */
    public String getParticularsRescue() {
        return (String) getAttributeInternal(PARTICULARSRESCUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParticularsRescue.
     * @param value value to set the ParticularsRescue
     */
    public void setParticularsRescue(String value) {
        setAttributeInternal(PARTICULARSRESCUE, value);
    }

    /**
     * Gets the attribute value for LocCurrcode, using the alias name LocCurrcode.
     * @return the value of LocCurrcode
     */
    public String getLocCurrcode() {
        return (String) getAttributeInternal(LOCCURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocCurrcode.
     * @param value value to set the LocCurrcode
     */
    public void setLocCurrcode(String value) {
        setAttributeInternal(LOCCURRCODE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for AuditRefNo, using the alias name AuditRefNo.
     * @return the value of AuditRefNo
     */
    public String getAuditRefNo() {
        return (String) getAttributeInternal(AUDITREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuditRefNo.
     * @param value value to set the AuditRefNo
     */
    public void setAuditRefNo(String value) {
        setAttributeInternal(AUDITREFNO, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for Lcno, using the alias name Lcno.
     * @return the value of Lcno
     */
    public String getLcno() {
        return (String) getAttributeInternal(LCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lcno.
     * @param value value to set the Lcno
     */
    public void setLcno(String value) {
        setAttributeInternal(LCNO, value);
    }

    /**
     * Gets the attribute value for ParticularsRescue2, using the alias name ParticularsRescue2.
     * @return the value of ParticularsRescue2
     */
    public String getParticularsRescue2() {
        return (String) getAttributeInternal(PARTICULARSRESCUE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParticularsRescue2.
     * @param value value to set the ParticularsRescue2
     */
    public void setParticularsRescue2(String value) {
        setAttributeInternal(PARTICULARSRESCUE2, value);
    }

    /**
     * Gets the attribute value for OtfEx, using the alias name OtfEx.
     * @return the value of OtfEx
     */
    public String getOtfEx() {
        return (String) getAttributeInternal(OTFEX);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtfEx.
     * @param value value to set the OtfEx
     */
    public void setOtfEx(String value) {
        setAttributeInternal(OTFEX, value);
    }

    /**
     * Gets the attribute value for RefDoctypeid, using the alias name RefDoctypeid.
     * @return the value of RefDoctypeid
     */
    public String getRefDoctypeid() {
        return (String) getAttributeInternal(REFDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefDoctypeid.
     * @param value value to set the RefDoctypeid
     */
    public void setRefDoctypeid(String value) {
        setAttributeInternal(REFDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for RefVoucherNo, using the alias name RefVoucherNo.
     * @return the value of RefVoucherNo
     */
    public String getRefVoucherNo() {
        return (String) getAttributeInternal(REFVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefVoucherNo.
     * @param value value to set the RefVoucherNo
     */
    public void setRefVoucherNo(String value) {
        setAttributeInternal(REFVOUCHERNO, value);
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
     * Gets the attribute value for txtLocationName, using the alias name txtLocationName.
     * @return the value of txtLocationName
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtLocationName.
     * @param value value to set the txtLocationName
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for txtGLVTYPE, using the alias name txtGLVTYPE.
     * @return the value of txtGLVTYPE
     */
    public String gettxtGLVTYPE() {
        return (String) getAttributeInternal(TXTGLVTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGLVTYPE.
     * @param value value to set the txtGLVTYPE
     */
    public void settxtGLVTYPE(String value) {
        setAttributeInternal(TXTGLVTYPE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getVoucherDet() {
        return (RowIterator) getAttributeInternal(VOUCHERDET);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getVoucherDet1() {
        return (RowIterator) getAttributeInternal(VOUCHERDET1);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllLocations() {
        return (EntityImpl) getAttributeInternal(ALLLOCATIONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllLocations(EntityImpl value) {
        setAttributeInternal(ALLLOCATIONS, value);
    }


    /**
     * @param voucherseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer voucherseq) {
        return new Key(new Object[] { voucherseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Voucherseq");
        setERPSolPKSeqName("voucher_seq");
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

            if (getVoucherType().equals("BV") && gettxtGLVTYPE().equals("R"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "BRV");
           else if (getVoucherType().equals("BV") && gettxtGLVTYPE().equals("P"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "BPV");
           else if (getVoucherType().equals("CV") && gettxtGLVTYPE().equals("R"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "CRV");
           else if (getVoucherType().equals("CV") && gettxtGLVTYPE().equals("P"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "CPV");
           else if (getVoucherType().equals("PV") && gettxtGLVTYPE().equals("R"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "CRV");
           else if (getVoucherType().equals("PV") && gettxtGLVTYPE().equals("P"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "CPV");
           else if (getVoucherType().equals("CNT"))
                populateAttributeAsChanged(GLVOUCHERTYPE, "CNT");
            else
                populateAttributeAsChanged(GLVOUCHERTYPE, "JVV");
            


            String plsql=" BEGIN ?:=func_get_voucher_no('"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getVoucherDate()+"','YYYY-MM-DD'),'"+getVoucherType()+"'); END;";
            CallableStatement cs = getDBTransaction().createCallableStatement(plsql, getDBTransaction().DEFAULT);
            System.out.println(plsql);
            try {
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.executeUpdate();
                populateAttributeAsChanged(VOUCHERNO, cs.getString(1));
            } catch (SQLException f) {
            }
            finally{
                try {
                    cs.close();
                } catch (SQLException f) {
                }
            }

            
                  
        }        

        super.doDML(operation, e);
    }
}

