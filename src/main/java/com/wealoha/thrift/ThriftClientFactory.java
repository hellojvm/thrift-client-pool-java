package com.wealoha.thrift;

import org.apache.thrift.TServiceClient;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TTransport;

/**
 * All IFace(subclass of TServiceClient) were generated by thrift.
 * We don't know their types. <br/>
 * Since they all extends super class TServiceClient,
 * construct a new Client need only just one line.<br/>
 * 
 * If you use {@link TBinaryProtocol}, you can using
 * {@link ThriftBinaryProtocolClientFactory}
 * 
 * @author javamonk
 * @createTime 2014年11月22日 下午2:49:53
 */
public interface ThriftClientFactory<T extends TServiceClient> {

    /**
     * return a new client using transport<br/>
     * 
     * <code>
     * <pre>
     *     public TServiceClient makeClient(TTransport transport) {
     *         return new Client(new TBinaryProtocol(transport));
     *     }
     * </pre>
     * </code>
     * 
     * @param transport
     * @return
     */
    T createClient(TTransport transport);

}
