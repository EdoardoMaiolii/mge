package it.unibo.oop.mge.c3d;

import it.unibo.oop.mge.c3d.geometry.Line;
import it.unibo.oop.mge.c3d.geometry.Point2D;
import it.unibo.oop.mge.c3d.geometry.Point3D;

public class Point3DRendererImpl implements Point3DRenderer {

    private final Point3D point;

    private static final Point2D FOCAL_POINT = Point2D.origin();

    @Override
    public final Point2D render(final Point2D pointOfView) {
        final double finalX = Line.fromPoints(Point2D.fromDoubles(this.point.getX(), this.point.getY()), pointOfView)
                .getZero();
        double finalY;
        if (this.point.getX() == 0) {
            final var mockPoint = Point3D.fromDoubles(1, this.point.getY(), this.point.getZ());
            finalY = Point3DRenderer.fromPoint(mockPoint).render(pointOfView).getY();
        } else {
            final Line heightLine = Line.fromPoints(Point2D.fromDoubles(this.point.getX(), this.point.getZ()),
                    FOCAL_POINT);
            finalY = heightLine.solveFor(finalX);
        }
        return Point2D.fromDoubles(finalX, finalY);
    }

    Point3DRendererImpl(final Point3D point) {
        this.point = point;
    }

}
