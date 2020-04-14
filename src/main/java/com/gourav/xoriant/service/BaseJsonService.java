package com.gourav.xoriant.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import com.gourav.xoriant.domain.Base;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class BaseJsonService {

  Map<String, Base> baseJsonMap =  new HashMap<>();

  public void save(final Base base) {
    baseJsonMap.put(base.getId(), base);
  }

  public String compare(final Base input, String id) throws JsonProcessingException {
    Base base = baseJsonMap.get(id);
    ObjectMapper mapper = new ObjectMapper();
    String jsonBase = mapper.writeValueAsString(base);
    String jsonInput = mapper.writeValueAsString(input);
    JsonNode beforeNode = mapper.readTree(jsonBase);
    JsonNode afterNode = mapper.readTree(jsonInput);
    JsonNode patchNode = JsonDiff.asJson(beforeNode, afterNode);
    return patchNode.toString();

  }
}
