package indi.a9043.gree_scanning.pojo;

import java.util.Date;

public class Comm {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Comm.Voucher
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    private String voucher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Comm.barcode
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Comm.date_time
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    private Date dateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Comm.Voucher
     *
     * @return the value of Comm.Voucher
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Comm.Voucher
     *
     * @param voucher the value for Comm.Voucher
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public void setVoucher(String voucher) {
        this.voucher = voucher == null ? null : voucher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Comm.barcode
     *
     * @return the value of Comm.barcode
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Comm.barcode
     *
     * @param barcode the value for Comm.barcode
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Comm.date_time
     *
     * @return the value of Comm.date_time
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Comm.date_time
     *
     * @param dateTime the value for Comm.date_time
     *
     * @mbg.generated Mon Jun 18 02:43:26 CST 2018
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}