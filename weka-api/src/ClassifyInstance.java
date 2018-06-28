import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class ClassifyInstance {
	public static void main (String[]args) {
		try {
			DataSource source = new DataSource("./Iris.arff");
			Instances trainDataset = source.getDataSet();
			trainDataset.setClassIndex(trainDataset.numAttributes()-1);
			//get number of classes
			int numClasses = trainDataset.numClasses();
			//print out class values in the training dataset
			for(int i=0 ; i<numClasses ; i++) {
				//get class string value using in the training dataset
				String classValue = trainDataset.classAttribute().value(i);
				System.out.println("Class value " + i + " is " + classValue);
			}
			//create and build the classifier
			NaiveBayes nb = new NaiveBayes();
			nb.buildClassifier(trainDataset);
			
			//load new Dataset
			
		}catch (Exception e) {
			
		}
	}
}