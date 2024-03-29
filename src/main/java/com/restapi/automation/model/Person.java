//-----------------------------------com.restapi.automation.model.Person.java-----------------------------------

package com.restapi.automation.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"firstname",
"lastname",
"subjectid",
"id"
})
@Generated("jsonschema2pojo")
public class Person {

@JsonProperty("firstname")
private String firstname;
@JsonProperty("lastname")
private String lastname;
@JsonProperty("subjectid")
private Integer subjectid;
@JsonProperty("id")
private Integer id;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("firstname")
public String getFirstname() {
return firstname;
}

@JsonProperty("firstname")
public void setFirstname(String firstname) {
this.firstname = firstname;
}

@JsonProperty("lastname")
public String getLastname() {
return lastname;
}

@JsonProperty("lastname")
public void setLastname(String lastname) {
this.lastname = lastname;
}

@JsonProperty("subjectid")
public Integer getSubjectid() {
return subjectid;
}

@JsonProperty("subjectid")
public void setSubjectid(Integer subjectid) {
this.subjectid = subjectid;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
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