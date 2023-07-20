package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@Getter
@Setter
public class DraftInvoiceDetail {
    /**
     * invoiceNumber
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    /**
     * reference
     */
    @JsonProperty("reference")
    private String reference;
    /**
     * invoiceDate
     */
    @JsonProperty("invoice_date")
    private String invoiceDate;
    /**
     * currencyCode
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * term
     */
    @JsonProperty("term")
    private String term;
    /**
     * memo
     */
    @JsonProperty("memo")
    private String memo;
    /**
     * paymentTerm
     */
    @JsonProperty("payment_term")
    private PaymentTerm paymentTerm;
    /**
     * metadata
     */
    @JsonProperty("metadata")
    private Metadata metadata;
}
