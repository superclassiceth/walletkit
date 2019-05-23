package com.breadwallet.crypto.events.wallet;

public final class WalletDeletedEvent implements WalletEvent {

    @Override
    public String toString() {
        return "Deleted";
    }

    @Override
    public <T> T accept(WalletEventVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
