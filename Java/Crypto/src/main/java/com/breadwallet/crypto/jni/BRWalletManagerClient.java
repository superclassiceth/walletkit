package com.breadwallet.crypto.jni;
import com.breadwallet.crypto.jni.CryptoLibrary.BRGetBlockNumberCallback;
import com.breadwallet.crypto.jni.CryptoLibrary.BRGetTransactionsCallback;
import com.breadwallet.crypto.jni.CryptoLibrary.BRSubmitTransactionCallback;
import com.breadwallet.crypto.jni.CryptoLibrary.BRTransactionEventCallback;
import com.breadwallet.crypto.jni.CryptoLibrary.BRWalletEventCallback;
import com.breadwallet.crypto.jni.CryptoLibrary.BRWalletManagerEventCallback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : bitcoin/BRWalletManager.h:94</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class BRWalletManagerClient extends Structure {
	/** C type : BRWalletManagerClientContext */
	public Pointer context;
	/** C type : BRGetBlockNumberCallback */
	public BRGetBlockNumberCallback funcGetBlockNumber;
	/** C type : BRGetTransactionsCallback */
	public BRGetTransactionsCallback funcGetTransactions;
	/** C type : BRSubmitTransactionCallback */
	public BRSubmitTransactionCallback funcSubmitTransaction;
	/** C type : BRTransactionEventCallback */
	public BRTransactionEventCallback funcTransactionEvent;
	/** C type : BRWalletEventCallback */
	public BRWalletEventCallback funcWalletEvent;
	/** C type : BRWalletManagerEventCallback */
	public BRWalletManagerEventCallback funcWalletManagerEvent;
	public BRWalletManagerClient() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("context", "funcGetBlockNumber", "funcGetTransactions", "funcSubmitTransaction", "funcTransactionEvent", "funcWalletEvent", "funcWalletManagerEvent");
	}
	/**
	 * @param context C type : BRWalletManagerClientContext<br>
	 * @param funcGetBlockNumber C type : BRGetBlockNumberCallback<br>
	 * @param funcGetTransactions C type : BRGetTransactionsCallback<br>
	 * @param funcSubmitTransaction C type : BRSubmitTransactionCallback<br>
	 * @param funcTransactionEvent C type : BRTransactionEventCallback<br>
	 * @param funcWalletEvent C type : BRWalletEventCallback<br>
	 * @param funcWalletManagerEvent C type : BRWalletManagerEventCallback
	 */
	public BRWalletManagerClient(Pointer context, BRGetBlockNumberCallback funcGetBlockNumber, BRGetTransactionsCallback funcGetTransactions, BRSubmitTransactionCallback funcSubmitTransaction, BRTransactionEventCallback funcTransactionEvent, BRWalletEventCallback funcWalletEvent, BRWalletManagerEventCallback funcWalletManagerEvent) {
		super();
		this.context = context;
		this.funcGetBlockNumber = funcGetBlockNumber;
		this.funcGetTransactions = funcGetTransactions;
		this.funcSubmitTransaction = funcSubmitTransaction;
		this.funcTransactionEvent = funcTransactionEvent;
		this.funcWalletEvent = funcWalletEvent;
		this.funcWalletManagerEvent = funcWalletManagerEvent;
	}
	public BRWalletManagerClient(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends BRWalletManagerClient implements Structure.ByReference {
		
	};
	public static class ByValue extends BRWalletManagerClient implements Structure.ByValue {

		public ByValue(Pointer context, BRGetBlockNumberCallback funcGetBlockNumber, BRGetTransactionsCallback funcGetTransactions, BRSubmitTransactionCallback funcSubmitTransaction, BRTransactionEventCallback funcTransactionEvent, BRWalletEventCallback funcWalletEvent, BRWalletManagerEventCallback funcWalletManagerEvent) {
			super(context, funcGetBlockNumber, funcGetTransactions, funcSubmitTransaction, funcTransactionEvent, funcWalletEvent, funcWalletManagerEvent);
		}
	};
}
