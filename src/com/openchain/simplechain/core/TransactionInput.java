package com.openchain.simplechain.core;

public class TransactionInput {
	public String transactionOutputId; // Reference o TransactionOutputs -> transactionId
	public TransactionOutput UTXO; // Contains the Unspent transaction output

	public TransactionInput(String transactionOutputId) {
		this.transactionOutputId = transactionOutputId;
	}
}