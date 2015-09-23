package groovy.runtime.metaclass.com.im.meta

class AnimalMetaClass extends DelegatingMetaClass {

    AnimalMetaClass(MetaClass delegate) {

        super(delegate)
    }

    Object invokeMethod(Object object, String method, Object[] arguments) {

        if (method == 'hasGroovy') {
            true
        } else {
            super.invokeMethod object, method, arguments
        }

    }
}
