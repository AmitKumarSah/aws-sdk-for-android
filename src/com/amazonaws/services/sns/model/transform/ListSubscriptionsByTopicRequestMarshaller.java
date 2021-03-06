/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Subscriptions By Topic Request Marshaller
 */
public class ListSubscriptionsByTopicRequestMarshaller implements Marshaller<Request<ListSubscriptionsByTopicRequest>, ListSubscriptionsByTopicRequest> {

    public Request<ListSubscriptionsByTopicRequest> marshall(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) {

        if (listSubscriptionsByTopicRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListSubscriptionsByTopicRequest> request = new DefaultRequest<ListSubscriptionsByTopicRequest>(listSubscriptionsByTopicRequest, "AmazonSNS");
        request.addParameter("Action", "ListSubscriptionsByTopic");
        request.addParameter("Version", "2010-03-31");

        if (listSubscriptionsByTopicRequest.getTopicArn() != null) {
            request.addParameter("TopicArn", StringUtils.fromString(listSubscriptionsByTopicRequest.getTopicArn()));
        }
        if (listSubscriptionsByTopicRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listSubscriptionsByTopicRequest.getNextToken()));
        }


        return request;
    }
}
