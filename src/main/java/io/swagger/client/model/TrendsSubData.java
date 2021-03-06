/*
 * Natural Voice SDK
 * Natural Voice SDKs are easiest and best supported way for most developers to quickly build and iterate Natural Voice applications that integrate with our services programmatically.
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TrendsSubData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T17:14:34.313-07:00")
public class TrendsSubData {
  @SerializedName("Count")
  private BigDecimal count = null;

  @SerializedName("Enough")
  private Boolean enough = null;

  @SerializedName("AverageEmotion")
  private BigDecimal averageEmotion = null;

  @SerializedName("AverageScore")
  private BigDecimal averageScore = null;

  @SerializedName("TopStrings")
  private List<String> topStrings = null;

  @SerializedName("TopStringCounts")
  private List<BigDecimal> topStringCounts = null;

  @SerializedName("TopStringNSS")
  private List<BigDecimal> topStringNSS = null;

  @SerializedName("AverageNSS")
  private BigDecimal averageNSS = null;

  public TrendsSubData count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public TrendsSubData enough(Boolean enough) {
    this.enough = enough;
    return this;
  }

   /**
   * Get enough
   * @return enough
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnough() {
    return enough;
  }

  public void setEnough(Boolean enough) {
    this.enough = enough;
  }

  public TrendsSubData averageEmotion(BigDecimal averageEmotion) {
    this.averageEmotion = averageEmotion;
    return this;
  }

   /**
   * Get averageEmotion
   * @return averageEmotion
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAverageEmotion() {
    return averageEmotion;
  }

  public void setAverageEmotion(BigDecimal averageEmotion) {
    this.averageEmotion = averageEmotion;
  }

  public TrendsSubData averageScore(BigDecimal averageScore) {
    this.averageScore = averageScore;
    return this;
  }

   /**
   * Get averageScore
   * @return averageScore
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAverageScore() {
    return averageScore;
  }

  public void setAverageScore(BigDecimal averageScore) {
    this.averageScore = averageScore;
  }

  public TrendsSubData topStrings(List<String> topStrings) {
    this.topStrings = topStrings;
    return this;
  }

  public TrendsSubData addTopStringsItem(String topStringsItem) {
    if (this.topStrings == null) {
      this.topStrings = new ArrayList<String>();
    }
    this.topStrings.add(topStringsItem);
    return this;
  }

   /**
   * Get topStrings
   * @return topStrings
  **/
  @ApiModelProperty(value = "")
  public List<String> getTopStrings() {
    return topStrings;
  }

  public void setTopStrings(List<String> topStrings) {
    this.topStrings = topStrings;
  }

  public TrendsSubData topStringCounts(List<BigDecimal> topStringCounts) {
    this.topStringCounts = topStringCounts;
    return this;
  }

  public TrendsSubData addTopStringCountsItem(BigDecimal topStringCountsItem) {
    if (this.topStringCounts == null) {
      this.topStringCounts = new ArrayList<BigDecimal>();
    }
    this.topStringCounts.add(topStringCountsItem);
    return this;
  }

   /**
   * Get topStringCounts
   * @return topStringCounts
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getTopStringCounts() {
    return topStringCounts;
  }

  public void setTopStringCounts(List<BigDecimal> topStringCounts) {
    this.topStringCounts = topStringCounts;
  }

  public TrendsSubData topStringNSS(List<BigDecimal> topStringNSS) {
    this.topStringNSS = topStringNSS;
    return this;
  }

  public TrendsSubData addTopStringNSSItem(BigDecimal topStringNSSItem) {
    if (this.topStringNSS == null) {
      this.topStringNSS = new ArrayList<BigDecimal>();
    }
    this.topStringNSS.add(topStringNSSItem);
    return this;
  }

   /**
   * Get topStringNSS
   * @return topStringNSS
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getTopStringNSS() {
    return topStringNSS;
  }

  public void setTopStringNSS(List<BigDecimal> topStringNSS) {
    this.topStringNSS = topStringNSS;
  }

  public TrendsSubData averageNSS(BigDecimal averageNSS) {
    this.averageNSS = averageNSS;
    return this;
  }

   /**
   * Get averageNSS
   * @return averageNSS
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAverageNSS() {
    return averageNSS;
  }

  public void setAverageNSS(BigDecimal averageNSS) {
    this.averageNSS = averageNSS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendsSubData trendsSubData = (TrendsSubData) o;
    return Objects.equals(this.count, trendsSubData.count) &&
        Objects.equals(this.enough, trendsSubData.enough) &&
        Objects.equals(this.averageEmotion, trendsSubData.averageEmotion) &&
        Objects.equals(this.averageScore, trendsSubData.averageScore) &&
        Objects.equals(this.topStrings, trendsSubData.topStrings) &&
        Objects.equals(this.topStringCounts, trendsSubData.topStringCounts) &&
        Objects.equals(this.topStringNSS, trendsSubData.topStringNSS) &&
        Objects.equals(this.averageNSS, trendsSubData.averageNSS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, enough, averageEmotion, averageScore, topStrings, topStringCounts, topStringNSS, averageNSS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsSubData {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    enough: ").append(toIndentedString(enough)).append("\n");
    sb.append("    averageEmotion: ").append(toIndentedString(averageEmotion)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    topStrings: ").append(toIndentedString(topStrings)).append("\n");
    sb.append("    topStringCounts: ").append(toIndentedString(topStringCounts)).append("\n");
    sb.append("    topStringNSS: ").append(toIndentedString(topStringNSS)).append("\n");
    sb.append("    averageNSS: ").append(toIndentedString(averageNSS)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

