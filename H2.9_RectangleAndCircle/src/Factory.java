public class Factory {

    public static Shape createGeometricShape(float... parameters){ //float... => varags = variable arguments - used to pass how many arguments you want
        // the factory selects what object to create taking into account the numbers of parameters
        if (parameters.length == 1) {
            return new Circle(parameters[0]);
        } else if (parameters.length == 2) {
            return new Rectangle(parameters[0], parameters[1]);
        } else {
            throw new IllegalArgumentException("Parameters are invalid");
        }
    }
}

