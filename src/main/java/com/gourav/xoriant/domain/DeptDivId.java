
package com.gourav.xoriant.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "label",
    "description",
    "dataTypeDefnId",
    "dataTypeDefn",
    "dataTypeDefnParameters",
    "sequence",
    "searchableFlag",
    "deletedFlag",
    "primaryKeyFlag",
    "uniqueKeyFlag",
    "nullableFlag",
    "tenantId",
    "localizedFlag"
})
public class DeptDivId {

    @JsonProperty("name")
    private String name;
    @JsonProperty("label")
    private String label;
    @JsonProperty("description")
    private String description;
    @JsonProperty("dataTypeDefnId")
    private String dataTypeDefnId;
    @JsonProperty("dataTypeDefn")
    private DataTypeDefn dataTypeDefn;
    @JsonProperty("dataTypeDefnParameters")
    private DataTypeDefnParameters dataTypeDefnParameters;
    @JsonProperty("sequence")
    private Double sequence;
    @JsonProperty("searchableFlag")
    private Boolean searchableFlag;
    @JsonProperty("deletedFlag")
    private Boolean deletedFlag;
    @JsonProperty("primaryKeyFlag")
    private Boolean primaryKeyFlag;
    @JsonProperty("uniqueKeyFlag")
    private Boolean uniqueKeyFlag;
    @JsonProperty("nullableFlag")
    private Boolean nullableFlag;
    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("localizedFlag")
    private Boolean localizedFlag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("dataTypeDefnId")
    public String getDataTypeDefnId() {
        return dataTypeDefnId;
    }

    @JsonProperty("dataTypeDefnId")
    public void setDataTypeDefnId(String dataTypeDefnId) {
        this.dataTypeDefnId = dataTypeDefnId;
    }

    @JsonProperty("dataTypeDefn")
    public DataTypeDefn getDataTypeDefn() {
        return dataTypeDefn;
    }

    @JsonProperty("dataTypeDefn")
    public void setDataTypeDefn(DataTypeDefn dataTypeDefn) {
        this.dataTypeDefn = dataTypeDefn;
    }

    @JsonProperty("dataTypeDefnParameters")
    public DataTypeDefnParameters getDataTypeDefnParameters() {
        return dataTypeDefnParameters;
    }

    @JsonProperty("dataTypeDefnParameters")
    public void setDataTypeDefnParameters(DataTypeDefnParameters dataTypeDefnParameters) {
        this.dataTypeDefnParameters = dataTypeDefnParameters;
    }

    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("searchableFlag")
    public Boolean getSearchableFlag() {
        return searchableFlag;
    }

    @JsonProperty("searchableFlag")
    public void setSearchableFlag(Boolean searchableFlag) {
        this.searchableFlag = searchableFlag;
    }

    @JsonProperty("deletedFlag")
    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    @JsonProperty("deletedFlag")
    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    @JsonProperty("primaryKeyFlag")
    public Boolean getPrimaryKeyFlag() {
        return primaryKeyFlag;
    }

    @JsonProperty("primaryKeyFlag")
    public void setPrimaryKeyFlag(Boolean primaryKeyFlag) {
        this.primaryKeyFlag = primaryKeyFlag;
    }

    @JsonProperty("uniqueKeyFlag")
    public Boolean getUniqueKeyFlag() {
        return uniqueKeyFlag;
    }

    @JsonProperty("uniqueKeyFlag")
    public void setUniqueKeyFlag(Boolean uniqueKeyFlag) {
        this.uniqueKeyFlag = uniqueKeyFlag;
    }

    @JsonProperty("nullableFlag")
    public Boolean getNullableFlag() {
        return nullableFlag;
    }

    @JsonProperty("nullableFlag")
    public void setNullableFlag(Boolean nullableFlag) {
        this.nullableFlag = nullableFlag;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("localizedFlag")
    public Boolean getLocalizedFlag() {
        return localizedFlag;
    }

    @JsonProperty("localizedFlag")
    public void setLocalizedFlag(Boolean localizedFlag) {
        this.localizedFlag = localizedFlag;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
