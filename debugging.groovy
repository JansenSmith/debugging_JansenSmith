double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
BowlerStudioController.setCsg(sphere,null)
// perform a union
CSG cubePlusSphere = cube.difference(sphere);
//You can return a CSG and set colors as a form a debugging
// Options: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/Color.html
cubePlusSphere.setColor(javafx.scene.paint.Color.CYAN);
//returning early displays just this item
BowlerStudioController.addCsg(cubePlusSphere)

return [cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)]