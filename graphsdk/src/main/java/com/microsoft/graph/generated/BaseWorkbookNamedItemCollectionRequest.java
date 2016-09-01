// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Named Item Collection Request.
 */
public class BaseWorkbookNamedItemCollectionRequest extends BaseCollectionRequest<BaseWorkbookNamedItemCollectionResponse, IWorkbookNamedItemCollectionPage> implements IBaseWorkbookNamedItemCollectionRequest {

    /**
     * The request builder for this collection of WorkbookNamedItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookNamedItemCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookNamedItemCollectionResponse.class, IWorkbookNamedItemCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookNamedItemCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookNamedItemCollectionPage get() throws ClientException {
        final BaseWorkbookNamedItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookNamedItem newWorkbookNamedItem, final ICallback<WorkbookNamedItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookNamedItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookNamedItem, callback);
    }

    public WorkbookNamedItem post(final WorkbookNamedItem newWorkbookNamedItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookNamedItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookNamedItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookNamedItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookNamedItemCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookNamedItemCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookNamedItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookNamedItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookNamedItemCollectionRequest)this;
    }

    public IWorkbookNamedItemCollectionPage buildFromResponse(final BaseWorkbookNamedItemCollectionResponse response) {
        final IWorkbookNamedItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookNamedItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookNamedItemCollectionPage page = new WorkbookNamedItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
