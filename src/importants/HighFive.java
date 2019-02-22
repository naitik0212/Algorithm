package importants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class ProductReviewScore{
    public int productId;
    public double reviewScore;

    public ProductReviewScore(int productId, double reviewScore) {
        this.productId = productId;
        this.reviewScore = reviewScore;
    }
}

public class HighFive {
    public static Map<Integer, Double> calculateHighestFive(int scoreCount, ArrayList<ProductReviewScore> reviewScoresOfProduct){
        Map<Integer, PriorityQueue<Double>> hm = new HashMap<>();

        for(int i = 0; i < scoreCount; i++) {
            ProductReviewScore product = reviewScoresOfProduct.get(i);
            if(!(hm.containsKey(product.productId))){
                PriorityQueue p = new PriorityQueue<>(5);
                hm.put(product.productId, p);
            }
            PriorityQueue<Double> topScores = hm.get(product.productId);
            if(topScores.size() >= 5){
                if(product.reviewScore > topScores.peek()){
                    topScores.poll();
                    topScores.add(product.reviewScore);
                }
            } else {
                topScores.add(product.reviewScore);
            }
        }

        Map<Integer, Double> result = new HashMap<>();
        for(Map.Entry<Integer, PriorityQueue<Double>> entry: hm.entrySet()){
            double sum = 0;

            PriorityQueue<Double> pq = entry.getValue();

            while (!pq.isEmpty()){
                sum+=pq.poll();
            }

            result.put(entry.getKey(), sum/5);
        }

        return result;
    }

    public static void main(String args[]) {
        ArrayList<ProductReviewScore> reviewScoresOfProduct = new ArrayList<>();
        ProductReviewScore temp = new ProductReviewScore(1,4);
        reviewScoresOfProduct.add(temp);
        reviewScoresOfProduct.add(new ProductReviewScore(2,9));
        reviewScoresOfProduct.add(new ProductReviewScore(1,5));
        reviewScoresOfProduct.add(new ProductReviewScore(2,8));
        reviewScoresOfProduct.add(new ProductReviewScore(2,8));
        reviewScoresOfProduct.add(new ProductReviewScore(1,6));
        reviewScoresOfProduct.add(new ProductReviewScore(1,7));
        reviewScoresOfProduct.add(new ProductReviewScore(1,8));
        reviewScoresOfProduct.add(new ProductReviewScore(1,9));
        reviewScoresOfProduct.add(new ProductReviewScore(1,10));
        reviewScoresOfProduct.add(new ProductReviewScore(2,10));
        reviewScoresOfProduct.add(new ProductReviewScore(2,9.5));
        reviewScoresOfProduct.add(new ProductReviewScore(2,5));

        System.out.println(calculateHighestFive(13,reviewScoresOfProduct));
    }
}
