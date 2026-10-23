package lu.bnl.archiveit.client.model;

import com.google.gson.annotations.SerializedName;

public class Account
{
    @SerializedName("created_by")
    private String createdBy;
    
    @SerializedName("created_date")
    private String createdDate;
    
    @SerializedName("last_updated_by")
    private String lastUpdatedBy;
    
    @SerializedName("last_updated_date")
    private String lastUpdatedDate;
    
    @SerializedName("invoice_data_budget_in_gbs")
    private int invoiceDataBudgetInGbs;
    
    @SerializedName("annual_subscription_cost")
    private int annualSubscriptionCost;
    
    @SerializedName("subscription_currency")
    private String subscriptionCurrency;
    
    @SerializedName("billing_name")
    private String billingName;
    
    @SerializedName("billing_email")
    private String billingEmail;
    
    @SerializedName("billing_address")
    private String billingAddress;
    
    @SerializedName("billing_period_start_date")
    private String billingPeriodStartDate;
    
    @SerializedName("member_since_date")
    private String memberSinceDate;
    
    @SerializedName("subscription_end_date")
    private String subscriptionEndDate;
    
    @SerializedName("auto_renew")
    private String autoRenew;
    
    @SerializedName("partner_url")
    private String partnerUrl;
    
    @SerializedName("partner_description")
    private String partnerDescription;
    
    @SerializedName("partner_type")
    private String partnerType;
    
    @SerializedName("google_analytics_id")
    private String googleAnalyticsId;
    
    @SerializedName("private_metadata_fields")
    private String privateMetadataFields;
    
    @SerializedName("custom_name")
    private String customName;
    
    @SerializedName("brozzler_option_visible")
    private String brozzlerOptionVisible;
    
    @SerializedName("custom_user_agent")
    private String customUserAgent;
    
    @SerializedName("oclc_api_key")
    private String oclcApiKey;
    
    @SerializedName("id")
    private int id;
    
    @SerializedName("public_site_settings")
    private String publicSiteSettings;
    
    @SerializedName("logo_blob")
    private String logoBlob;
    
    @SerializedName("organization_name")
    private String organizationName;
    
    @SerializedName("public_registry_enabled")
    private boolean publicRegistryEnabled;
    
    @SerializedName("metadata_public")
    private boolean metadataPublic;
    
    @SerializedName("tos_enabled")
    private boolean tosEnabled;
    
    @SerializedName("feed_enabled")
    private boolean feedEnabled;
    
    @SerializedName("deleted")
    private boolean deleted;
    
    @SerializedName("ignore_robots_option_visible")
    private boolean ignoreRobotsOptionVisible;
    
    @SerializedName("ignore_delay_option_visible")
    private boolean ignoreDelayOptionVisible;
    
    @SerializedName("account_type")
    private String accountType;
    
    @SerializedName("active")
    private boolean active;
    
    @SerializedName("max_concurrent_test_crawls")
    private int maxConcurrentTestCrawls;
    
    @SerializedName("hidden")
    private boolean hidden;
    
    @SerializedName("warc_upload_link_visible")
    private boolean warcUploadLinkVisible;
    
    @SerializedName("default_crawl_limit_in_gbs")
    private String defaultCrawlLimitInGbs;
    
    @SerializedName("show_longer_crawl_durations")
    private boolean showLongerCrawlDurations;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public int getInvoiceDataBudgetInGbs() {
		return invoiceDataBudgetInGbs;
	}

	public void setInvoiceDataBudgetInGbs(int invoiceDataBudgetInGbs) {
		this.invoiceDataBudgetInGbs = invoiceDataBudgetInGbs;
	}

	public int getAnnualSubscriptionCost() {
		return annualSubscriptionCost;
	}

	public void setAnnualSubscriptionCost(int annualSubscriptionCost) {
		this.annualSubscriptionCost = annualSubscriptionCost;
	}

	public String getSubscriptionCurrency() {
		return subscriptionCurrency;
	}

	public void setSubscriptionCurrency(String subscriptionCurrency) {
		this.subscriptionCurrency = subscriptionCurrency;
	}

	public String getBillingName() {
		return billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public String getBillingEmail() {
		return billingEmail;
	}

	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingPeriodStartDate() {
		return billingPeriodStartDate;
	}

	public void setBillingPeriodStartDate(String billingPeriodStartDate) {
		this.billingPeriodStartDate = billingPeriodStartDate;
	}

	public String getMemberSinceDate() {
		return memberSinceDate;
	}

	public void setMemberSinceDate(String memberSinceDate) {
		this.memberSinceDate = memberSinceDate;
	}

	public String getSubscriptionEndDate() {
		return subscriptionEndDate;
	}

	public void setSubscriptionEndDate(String subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}

	public String getAutoRenew() {
		return autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getPartnerUrl() {
		return partnerUrl;
	}

	public void setPartnerUrl(String partnerUrl) {
		this.partnerUrl = partnerUrl;
	}

	public String getPartnerDescription() {
		return partnerDescription;
	}

	public void setPartnerDescription(String partnerDescription) {
		this.partnerDescription = partnerDescription;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getGoogleAnalyticsId() {
		return googleAnalyticsId;
	}

	public void setGoogleAnalyticsId(String googleAnalyticsId) {
		this.googleAnalyticsId = googleAnalyticsId;
	}

	public String getPrivateMetadataFields() {
		return privateMetadataFields;
	}

	public void setPrivateMetadataFields(String privateMetadataFields) {
		this.privateMetadataFields = privateMetadataFields;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getBrozzlerOptionVisible() {
		return brozzlerOptionVisible;
	}

	public void setBrozzlerOptionVisible(String brozzlerOptionVisible) {
		this.brozzlerOptionVisible = brozzlerOptionVisible;
	}

	public String getCustomUserAgent() {
		return customUserAgent;
	}

	public void setCustomUserAgent(String customUserAgent) {
		this.customUserAgent = customUserAgent;
	}

	public String getOclcApiKey() {
		return oclcApiKey;
	}

	public void setOclcApiKey(String oclcApiKey) {
		this.oclcApiKey = oclcApiKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublicSiteSettings() {
		return publicSiteSettings;
	}

	public void setPublicSiteSettings(String publicSiteSettings) {
		this.publicSiteSettings = publicSiteSettings;
	}

	public String getLogoBlob() {
		return logoBlob;
	}

	public void setLogoBlob(String logoBlob) {
		this.logoBlob = logoBlob;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public boolean isPublicRegistryEnabled() {
		return publicRegistryEnabled;
	}

	public void setPublicRegistryEnabled(boolean publicRegistryEnabled) {
		this.publicRegistryEnabled = publicRegistryEnabled;
	}

	public boolean isMetadataPublic() {
		return metadataPublic;
	}

	public void setMetadataPublic(boolean metadataPublic) {
		this.metadataPublic = metadataPublic;
	}

	public boolean isTosEnabled() {
		return tosEnabled;
	}

	public void setTosEnabled(boolean tosEnabled) {
		this.tosEnabled = tosEnabled;
	}

	public boolean isFeedEnabled() {
		return feedEnabled;
	}

	public void setFeedEnabled(boolean feedEnabled) {
		this.feedEnabled = feedEnabled;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isIgnoreRobotsOptionVisible() {
		return ignoreRobotsOptionVisible;
	}

	public void setIgnoreRobotsOptionVisible(boolean ignoreRobotsOptionVisible) {
		this.ignoreRobotsOptionVisible = ignoreRobotsOptionVisible;
	}

	public boolean isIgnoreDelayOptionVisible() {
		return ignoreDelayOptionVisible;
	}

	public void setIgnoreDelayOptionVisible(boolean ignoreDelayOptionVisible) {
		this.ignoreDelayOptionVisible = ignoreDelayOptionVisible;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getMaxConcurrentTestCrawls() {
		return maxConcurrentTestCrawls;
	}

	public void setMaxConcurrentTestCrawls(int maxConcurrentTestCrawls) {
		this.maxConcurrentTestCrawls = maxConcurrentTestCrawls;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public boolean isWarcUploadLinkVisible() {
		return warcUploadLinkVisible;
	}

	public void setWarcUploadLinkVisible(boolean warcUploadLinkVisible) {
		this.warcUploadLinkVisible = warcUploadLinkVisible;
	}

	public String getDefaultCrawlLimitInGbs() {
		return defaultCrawlLimitInGbs;
	}

	public void setDefaultCrawlLimitInGbs(String defaultCrawlLimitInGbs) {
		this.defaultCrawlLimitInGbs = defaultCrawlLimitInGbs;
	}

	public boolean isShowLongerCrawlDurations() {
		return showLongerCrawlDurations;
	}

	public void setShowLongerCrawlDurations(boolean showLongerCrawlDurations) {
		this.showLongerCrawlDurations = showLongerCrawlDurations;
	}

	@Override
	public String toString() {
		return "Account [createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", invoiceDataBudgetInGbs=" + invoiceDataBudgetInGbs
				+ ", annualSubscriptionCost=" + annualSubscriptionCost + ", subscriptionCurrency=" + subscriptionCurrency + ", billingName="
				+ billingName + ", billingEmail=" + billingEmail + ", billingAddress=" + billingAddress
				+ ", billingPeriodStartDate=" + billingPeriodStartDate + ", memberSinceDate=" + memberSinceDate
				+ ", subscriptionEndDate=" + subscriptionEndDate + ", autoRenew=" + autoRenew + ", partnerUrl="
				+ partnerUrl + ", partnerDescription=" + partnerDescription + ", partnerType=" + partnerType
				+ ", googleAnalyticsId=" + googleAnalyticsId + ", privateMetadataFields=" + privateMetadataFields
				+ ", customName=" + customName + ", brozzlerOptionVisible=" + brozzlerOptionVisible
				+ ", customUserAgent=" + customUserAgent + ", oclcApiKey=" + oclcApiKey + ", id=" + id
				+ ", publicSiteSettings=" + publicSiteSettings + ", logoBlob=" + logoBlob + ", organizationName="
				+ organizationName + ", publicRegistryEnabled=" + publicRegistryEnabled + ", metadataPublic="
				+ metadataPublic + ", tosEnabled=" + tosEnabled + ", feedEnabled=" + feedEnabled + ", deleted="
				+ deleted + ", ignoreRobotsOptionVisible=" + ignoreRobotsOptionVisible + ", ignoreDelayOptionVisible="
				+ ignoreDelayOptionVisible + ", accountType=" + accountType + ", active=" + active + ", maxConcurrentTestCrawls="
				+ maxConcurrentTestCrawls + ", hidden=" + hidden + ", warcUploadLinkVisible=" + warcUploadLinkVisible
				+ ", defaultCrawlLimitInGbs=" + defaultCrawlLimitInGbs + ", showLongerCrawlDurations="
				+ showLongerCrawlDurations + "]";
	}
	
	
}
