package org.jboss.jandex;

public interface AdditionalScanInfoHook {

    default void startClass() {

    }

    default boolean shouldHandleClassPoolTag(int tag) {
        return false;
    }

    default void handleConstantPoolEntry(int pos, int tag, byte[] buf) {

    }

    default void endClass() {

    }

    AdditionalScanInfoHook NULL = new AdditionalScanInfoHook() {
    };

    default void addClassInfo(DotName thisName, Type superClassType, short flags, Type[] interfaceTypes) {

    }
}
