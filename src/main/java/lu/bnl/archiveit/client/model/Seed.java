package lu.bnl.archiveit.client.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Seed 
{
	@SerializedName("active")
    private boolean active;

    @SerializedName("canonical_url")
    private String canonicalUrl;

    @SerializedName("collection")
    private int collection;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("created_date")
    private String createdDate;

    @SerializedName("deleted")
    private boolean deleted;

    @SerializedName("http_response_code")
    private Integer httpResponseCode;

    @SerializedName("id")
    private int id;

    @SerializedName("last_checked_http_response_code")
    private String lastCheckedHttpResponseCode;

    @SerializedName("last_updated_by")
    private String lastUpdatedBy;

    @SerializedName("last_updated_date")
    private String lastUpdatedDate;

    @SerializedName("publicly_visible")
    private boolean publiclyVisible;

    @SerializedName("seed_groups")
    private List<Object> seedGroups;

    @SerializedName("seed_type")
    private String seedType;

    @SerializedName("url")
    private String url;

    @SerializedName("valid")
    private Boolean valid;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getHttpResponseCode() {
        return httpResponseCode;
    }

    public void setHttpResponseCode(Integer httpResponseCode) {
        this.httpResponseCode = httpResponseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastCheckedHttpResponseCode() {
        return lastCheckedHttpResponseCode;
    }

    public void setLastCheckedHttpResponseCode(String lastCheckedHttpResponseCode) {
        this.lastCheckedHttpResponseCode = lastCheckedHttpResponseCode;
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

    public boolean isPubliclyVisible() {
        return publiclyVisible;
    }

    public void setPubliclyVisible(boolean publiclyVisible) {
        this.publiclyVisible = publiclyVisible;
    }

    public String getSeedType() {
        return seedType;
    }

    public void setSeedType(String seedType) {
        this.seedType = seedType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean isValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Seed [" +
                "active=" + active +
                ", canonicalUrl='" + canonicalUrl + '\'' +
                ", collection=" + collection +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", deleted=" + deleted +
                ", httpResponseCode=" + httpResponseCode +
                ", id=" + id +
                ", lastCheckedHttpResponseCode=" + lastCheckedHttpResponseCode +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", publiclyVisible=" + publiclyVisible +
                ", seedType='" + seedType + '\'' +
                ", url='" + url + '\'' +
                ", valid=" + valid +
                ']';
    }
    
}
