package com.example.pranav.recipebook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Pranav on 01-08-2016.
 */
public class DataBase extends SQLiteOpenHelper
{
    public static String DATABASE_NAME = "recipe";
    SQLiteDatabase sdb;


    public  String RECIPE_NAME="name";
    public  String DESCRIPTION="des";
    public  String INGREDIENTS="ing";
    public  String PROCEDURE="pro";
    public static String VSR_NO="no";

    public DataBase(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
        sdb=this.getWritableDatabase();
        Log.d("database", "created");
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE IF NOT EXISTS recipes("+VSR_NO+" integer primary key autoincrement,"+RECIPE_NAME+" text,"+DESCRIPTION+" text,"+INGREDIENTS+" text,"+PROCEDURE+" text)";
        db.execSQL(sql);
        Log.d("table","done");

        ContentValues cv = new ContentValues();

        cv.put(RECIPE_NAME,"Chicken Soup");
        cv.put(DESCRIPTION,"Your Kids Will Love It..");
        cv.put(INGREDIENTS,"Chicken boneless - 2 cups"+"\n Water - 4 cups"+"\n Carrot(grated) - a small cup"+"\n Egg White - 1 no"+"\n Vinegar - 1/2 tsp"+"\n Cornflour - 3 tsp"+"\n White Papper - As reqd"+"\n Salt - As reqd");
        cv.put(PROCEDURE,"First cook chicken eith salt and water in a cooker."+"\n Separate the chicken stock and keep it aside."+"\n Shred the chicken into small pieces either by hands or run in a mincer."+"\n Bring to boil the chicken stock."+
        "\n Add grated carrot and boil till carrot is cooked."+"\n Add chicken pieces and boil them together."+"\n Now add vinegar and white papper. Boil for another 5 to 10 minutes"+"\n Add egg white through a strainer, so that it falls through the stainer as drops."+
        "\n When all ingredients get blended, mix cornflour with water till it gets thickened."+"\n Serve hot garnished with coriander leaves.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chicken Corn Soup");
        cv.put(DESCRIPTION,"Quick n Easy For Soup Lovers.");
        cv.put(INGREDIENTS,"Chicken pop - 2-3 pieces"+"\n Crab flakes - 100gm"+"\n Egg White - 2 no"+"\n Cream of Corn Can - 1 no"+"\n Corn Starch - 1 tsp"+"\n White Papper - As reqd"+"\n Salt - As reqd");
        cv.put(PROCEDURE,"Cook chicken in a pressure cooker.(You can fill up your cooker with 5 glasses of water or as much you want.)"+"\n Drain the stock and in a vessel continue heating the stock."+"\n Shred the chicken pieces and remove the bones."+"\n Add the cream of corn the boiling stock on low flame."+
                "\n Add the shredded chicken and mix it."+"\n Take 1 tbsp of corn starch powder and mox with water till it gets dissolved and add this to the water and mix it.(It will start getting thicker.)"+"\n Use a chenni(filter tray) and pour the egg into ingredients and keep mixing so that the egg gets cooked spilting over."+"\n Once the egg gets fluffy and the soup is pretty cooked, turn off the gas."+
                "\n Serve in a bowl."+"\n You can add salt,pepper or soy sauce for taste.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Prawn Coconut Soup");
        cv.put(DESCRIPTION,"A yellow coconut and prawn soup.");
        cv.put(INGREDIENTS,"Shrimps(chopped) - 250gm"+"\n Yam(chena) - 100gm"+"\n White Pumpkin - 100gm"+"\n Beans - 50gm"+"\n Peas - 50gm"+"\n  Yellow Cucumber - 100gm"+"\n Drum Stick(Muringakkai) - 100gm"+"\n Coconuts - 2nos"+"\n Corn Flour - 5gm"+"\n Turmeric Powder - 2gm"+"\n Peppercorns - 5gm"+"\n Cumin Seeds(Jeerakam) - 1tsp"+"\n Ginger - 2 piece"+"\n Green Chillies - 6nos"+"\n Oil - 25ml"+"\n Water - 100ml"+"\n Salt - As reqd");
        cv.put(PROCEDURE,"Wash, clean and cut the vegetables."+"\n Boil them till soft but not mashy."+"\n Chop shrimps."+"\n Take out milk from coconuts with 100ml of water. Take out 2 extracts with 600ml of water and 400ml of water respectively."+"\n Grind together peppercorns, green chillies, cumin and turmeric to a fine paste."+"\n Heat oil in a thick bottomed pan."+"\n Add ground masala and fry for a minute."+"\n Add second extract and simmer for 15 minutes."+
                "\n Mix corn flour with a little water and add to the gravy."+"\n You can add salt,pepper or soy sauce for taste.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mutton Soup");
        cv.put(DESCRIPTION,"Mutton Soup Lovers");
        cv.put(INGREDIENTS,"Mutton - 150gm"+"\n Mutton Bones - 200gm"+"\n Bay Leaves - 4"+"\n Pepper corns - 20gm"+"\n Barley Powder - 25gm"+"\n Onions(chopped) - 30gm"+"\n Carrots(chopped) - 50gm"+"\n Ginger - A small piece"+"\n Salt - As reqd"+"\n Pepper Powder - As reqd");
        cv.put(PROCEDURE,"In a thick pan, add mutton, mutton bones, 10glasses of water, carrots, onions, bay leaves, pepper corns,salt and boil on low heat for 2 hours."+"\n When the water evaporates and becomes 6 glasses of water, remove from heat."+"\n Sieve and place in another bowl."+"\n To the above soup, add barley powder and cook until the soup thickens."+
                "\n Add salt and pepper powder to taste, boiled mutton pieces and cook for another 5 minutes."+"\n Serve hot.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Tomato Soup");
        cv.put(DESCRIPTION,"Tomato soup prepared in natural and easy method. Highly nutritious and delicious.");
        cv.put(INGREDIENTS,"Tomatoes(chopped) - 125g"+"\n Carrot(chopped) - 1no"+"\n Coconut milk - 1/4 cup"+"\n Salt - As reqd");
        cv.put(PROCEDURE,"Take a vessel and put chopped tomatoes and scraped carrot. Pour 2 cups water and cook in medium heat."+"\n When the vegetables are done, stir with a ladle and mash them."+"\n Seive the mashed vegetables and gather the stock."+
                "\n Pour coconut milk into the vegetable stock and add required salt."+"\n Tomato soup is ready and serve hot.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"French Onion Soup");
        cv.put(DESCRIPTION,"French Onion Soup");
        cv.put(INGREDIENTS,"Onions(thinly sliced) - 4 nos"+"\n Butter - 3 tbsp"+"\n All purpose flour(Maida) - 4 tsp"+"\n Bay leaves(Karuka ela) - 2 nos"+"\n salt - 1 tsp"+"\n Black Pepper Powder - 1/2 tsp"+"\n *Vegetable Stock or Water - 4 cups"+"\n Bread Slices - 2 nos"+"\n Cheese(grated) - 40 gm"+"\n * For making veg stock: \n Mix everything in a pressure cooker, cover it with lid and boil for 15 minutes. If you want to make a clear soup, don't mash it. Turn off the gas. Strain using a strainer. Use the liquid for making soup.");
        cv.put(PROCEDURE,"Heat butter in a pan."+"\n Fry the onions till they become golden brown while stirring continuously"+"\n Add flour while stirring and cook for 2 minutes."+
                "\n Add the stock and bring to a boil."+"\n Add salt, bay leaves and black pepper powder and simmer for half an hour."+"\n Remove the bay leaves."+"\n Cut the bread slices into half and cover with the grated cheese and grill until the cheese melts."+"\n Serve the soup in a bowl with the bread slice floating.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Garlic Soup");
        cv.put(DESCRIPTION,"Soup made with garlic and wheat flour.");
        cv.put(INGREDIENTS,"Garlic pods - 6 nos"+"\n Wheat flour - 1 tbsp"+"\n Oil - 1 tbsp"+"\n Coriander Powder - 1/2 tsp"+"\n Red chilly powder - 1/2 tsp"+"\n Turmeric powder - 2 pinch"+"\n Salt - As reqd."+"\n Mustard seeds - 1/2 tsp"+"\n Curry leaves - 4/5 nos"+"\n Water - 2 cups");
        cv.put(PROCEDURE,"Heat oil in a pan or a kadai."+"\n Splutter mustard seeds."+"\n Add curry leaves, garlic and wheat flour."+"\n Stir fry on low flame."+"\n When flour becomes golden, add water, coriander powder, red chilly powder, turmeric powder and salt."+"\n Cook on low fire until wheat flour and water mixes well and gets a consistency of a soup."+"\n Serve hot."+"\n You can use this as a curry too.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Italian Mushroom Soup");
        cv.put(DESCRIPTION,"Earthy flavored thick soup.");
        cv.put(INGREDIENTS,"White mushroom - 150gm"+"\n Olive oil(or veg oil) - 3 tsp"+"\n Tomato - 1 no"+"\n Salt - As reqd"+"\n Maida - 3 tbsp"+"\n Milk - 2 1/2 cups"+"\n Black pepper - As reqd.");
        cv.put(PROCEDURE,"Chop the mushroom and tomato."+"\n The stem of mushroom can also be used in the soup."+"\n Heat olive oil in a pan."+"\n Saute the mushroom till all the wather in the mushroom evaporates."+"\n This take only 1 or 2 minutes and you get the mushroom with a concentrated earthy flavour which is excellent in soup."+"\n Sprinkle salt to the sauted mushroom and keep aside."+"\n In a vessel, dry roast the maida till it turns slight brown."+"\n Add boiled milk slowly and stir well so that limps are not formed."+
                "\n Stir till the mixture thickens to the desired consistency."+"\n Add the sauteed mushroom and pepper."+"\n Add more salt if required."+"/n Serve hot.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Paalak Soup");
        cv.put(DESCRIPTION,"An easy and delicious soup.");
        cv.put(INGREDIENTS,"Paalak(Spinach) - 250 gm"+"\n Onion(big) - 1/2 of one"+"\n Bay leaves - 2 nos"+"\n Water - 2 cups"+"\n Cinnamon - 2 small sticks or 1 long stick"+"\n Milk - 1/2 cup"+"\n Butter - 1 tsp"+"\n Pepper - 1 tsp or as reqd"+"\n Salt - As reqd"+"\n Oil - 1 tbsp");
        cv.put(PROCEDURE,"Heat the oil in a pan."+"\n Add the cinnamon and bay leaves."+"\n Add the coarsely chopped onion and fry for 2 mins."+
                "\n Add the washed spinach leaves."+"\n Reduce heat to sim and saute for 5 mins or till the spinach is wilted."+"\n Remove from fire and keep aside to cool."+"\n Blend the mixture in a blender or mixer with little water."+"\n Remove the bay leaf and cinnamon stick before blending."+"\n return the paste to pan and add the amount of water required to your desired consistency."+"\n Bring to boil."+"\n Add milk, pepper and salt."+"\n Reduce heat and simmer for 2 mins."+"\n Add butter."+"\n Serve hot.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Sizzling Soup");
        cv.put(DESCRIPTION,"Sizzling soup.");
        cv.put(INGREDIENTS,"Vegetable stock - 5 cups"+"\n *Murmure - 1/2 cups"+"\n Carrot - 1 no"+"\n Salt - 1 tsp"+"\n Mushrooms - A few"+"\n Ajinomoto - 1/2 tsp"+"\n Spinach leaves(cheera) - 8 or 10 nos"+"\n Soya sauce - 1 tsp"+"\n Paneer - 100 gm"+"\n Sherry - 1/4 tsp"+"\n Black pepper - 1/4 tsp"+"\n *Make them crisp by frying."+"\n For making vegetable stock:"+"\n Onion - 1 no"+"\n Carrot - 1 no"+"\n Cabbage - 1 no"+"\n Water - 7 cups"+
                "\n Ginger - 1/2 tsp"+"\n Potato - 1 no"+"\n Garlic - 1/2 tsp"+"\n French beans - 4 no"+"\n Salt - 1/2 tsp");
        cv.put(PROCEDURE,"For making veg stock:-"+"\n Mix everything in a pressure cooker,cover it with its lid and boil for 15 mins. If you want to make a clear soup, don't mash it. Turn off the gas. Strain using a strainer. Use the liquid for making soup."+"\n\n For making the soup :-"+
                "\n Make vegetable stock."+"\n Add to it mushroom ,paneer, carrots and spinach."+"\n Mix ajinomoto,salt and black pepper."+"\n Add soya sauce and sherry."+"\n While serving, add murmure."+"\n Serve hot with chilly sauce.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Sweet Corn Soup");
        cv.put(DESCRIPTION,"Sweet Corn soup.");
        cv.put(INGREDIENTS,"Sweet corn kernels boiled - 1/2 cup\n"+"Vegetable stock - 4 cups\n"+"Oil - 1 tablespoon\n"+"Cabbage - 1/4 small\n"+"Carrot finely chopped - 1/4 medium\n"+"Sweet corn(cream style) - 2 cups\n"+"White pepper powder - 1/2 tsp\n"+"Salt - As reqd\n"+"Cornflour/ corn starch - 3 tsp ");
        cv.put(PROCEDURE,"Heat oil in a non stick wok. Grate cabbage and add to the hot oil. Add carrot and sauté on high heat for 1-2 minutes.\n"+"Add cream style sweet corn and mix well. Add 4 cups vegetable stock and mix and allow it to come to a boil.\n"+"Mix pepper powder in 2 tbsps water and add to the soup along with salt and mix well.\n"+"Add corn kernels and allow it to come to a boil again. Mix cornflour in 2 tbsps water and add to the soup and cook till it thickens. Serve hot.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Achappam");
        cv.put(DESCRIPTION,"Easy rose cookies");
        cv.put(INGREDIENTS,"Rice flour-500 grams\n"+"Sugar-1 cup\n"+"Salt- a pinch to adjust the taste\n"+"Oil –to deep fry\n"+"Cumin seeds-1 teaspoon\n"+"Sesame seeds-2 teaspoon\n"+"Eggs - 2 nos.\n"+"Thick coconut milk-2 cups.");
        cv.put(PROCEDURE,"First sieve the rice flour to get the finely ground flour.\n"+"Please note that achappam can be made only with finely grounded rice flour or else we won't get the real taste of achappam.\n"+"Powder the sugar in a mixer grinder and keep it aside.\n"+"Take a bowl and mix together the rice and coconut milk so that it makes a smooth paste.\n"+"Beat the eggs using an egg beater and add it to the batter.\n"+"Then add the powdered sugar little by little and make sure that no lumps are made.\n"+
                "Mix everything well.\n"+"Add a pinch of salt to the batter.\n"+"Add the cumin seeds and sesame seeds into the batter and mix well until everything is mixed well.\n"+"The batter should be of semi thick consistency.\n"+"Switch on the stove and place a frying pan (preferably an uruli or a thick bottomed vessel) on the stove.\n"+"Add oil into the pan and heat it.\n"+"When the oil gets heated, just immerse the achu or iron mould into it and allow it to get heated up.\n"+
                "Make sure that the achu is completely immersed in the oil.\n"+"Then immerse the achu in the batter.\n"+"Please note that only three fourth of the achu is immersed in the batter.\n"+"Take it out from the batter and again immerse it in the hot oil.\n"+"When the batter is cooked, it will detach itself from the achu or iron mould.\n"+"Do the same with the rest of the batter.\n"+"Turn both sides of the achappam occasionally.\n"+"When both the sides turn a golden brown colour, remove it from the oil and drain it on a kitchen tissue.\n"+
                "When the achappam is cooled, store it in an airtight container.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Banana Bread");
        cv.put(DESCRIPTION,"Easy to make cake like bread");
        cv.put(INGREDIENTS,"very ripe bananas, peeled - 2-3\n"+"cup melted butter - 1/3 \n"+"cup sugar(1/2 cup if you would like it less sweet, 1 cup if more sweet) - 3/4 \n"+"egg(beaten) - 1 no \n"+"vanilla extract - 1 tsp \n"+"baking soda - 1 tsp \n"+"Pinch of salt\n"+" flour - 1 1/2 \n");
        cv.put(PROCEDURE,"Preheat the oven to 350°F (175°C), and butter a 4x8-inch loaf pan.\n"+"In a mixing bowl, mash the ripe bananas with a fork until completely smooth. Stir the melted butter into the mashed bananas.\n"+"Mix in the baking soda and salt. Stir in the sugar, beaten egg, and vanilla extract. Mix in the flour.\n"+"Pour the batter into your prepared loaf pan. Bake for 50 minutes to 1 hour at 350°F (175°C), or until a tester inserted into the center comes out clean.\n"+
                "Remove from oven and cool completely on a rack. Remove the banana bread from the pan. Slice and serve. (A bread knife helps to make slices that aren't crumbly.)");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Banana Nut Muffins");
        cv.put(DESCRIPTION,"Banana Nut Muffins.");
        cv.put(INGREDIENTS,"2 to 3 ripe bananas, thoroughly mashed (about 1 cup mashed)\n"+"1/3 cup melted butter\n"+"3/4 cup sugar\n"+"1 large egg, beaten\n"+"1 teaspoon vanilla extract\n"+"1 Tbsp strong brewed coffee or espresso, or a pinch of instant coffee granules mixed with a Tbsp of water (optional)\n"+"1 teaspoon baking soda\n"+"Pinch of salt\n"+"1 1/2 cup of flour\n"+"1 cup chopped walnuts or pecans (toasted or raw)\n");
        cv.put(PROCEDURE,"Preheat oven, prepare muffin pan: Preheat the oven to 350°F. Line a muffin pan with paper liners.\n"+"Combine wet ingredients and sugar: Thoroughly mash the bananas in a large bowl. Stir the melted butter into the bananas. Mix in the sugar, egg, coffee and vanilla extract.\n"+"Combine dry ingredients: Whisk together the flour, baking soda, and salt.\n"+"Add dry ingredients into wet, add nuts: Add the flour mixture to the banana mixture, a third at a time, stirring until it is just incorporated. (Do not over-mix! Over-mixing will result in dense, tough muffins.)\n"+
                "Fold in the chopped walnuts or pecans.\n"+"Fill muffin cups, and bake: Lightly spoon the mixture into a prepared muffin tin. Bake at 350°F for 20-25 minutes.\n"+"Check for doneness by pressing down on the top of the muffin. If it bounces back, it's done. You can also test by inserting a skewer or other tester into the center of a muffin. If it comes out clean, it's done.\n"+"Cool on a rack.");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Nutri Cutlet");
        cv.put(DESCRIPTION,"Healthy one !!");
        cv.put(INGREDIENTS,"Nutri (Meal maker/Soya chunks) - 1/2 cup\n"+"Ginger - A small piece\n"+"Greenchillies - 2 no\n"+"Onion (big) - 2 nos\n"+"Cornflour - As reqd\n"+"Egg (beaten) - 1 no\n"+"Milk\n"+"Breadcrumbs\n"+"Allpurposeflour (Maida) - As reqd\n"+"Salt - As reqd\n"+"Oil to fry");
        cv.put(PROCEDURE,"Put Nutri in boiled water and close it. Open after 5 minutes when it will be swollen fully and then drain it. Nicely drain the water by squeezing it and then grind it.\n"+"It should not grind to a paste.\n"+"Cut garlic, green chillies, onion into small pieces and then fry it after cracking mustards.\n"+"Put the fried things to the half-grinded Nutri and mix well.\n"+"Add salt and maida flour to the mixture say about two to three teaspoons and mix well too.\n"+"Break the egg and mix nicely with milk to form a batter.\n"+
                "Add about 2 - 3 tsp of corn flour to it and mix well.\n"+"Add a pinch of salt.\n"+"Make the above prepared Nutri paste to your desired shape and dip it in the egg batter and roll in the bread crumbs.\n"+"Fry till golden brown.\n"+"Serve with chilli or tomato sauce.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bun With Stuffed Egg");
        cv.put(DESCRIPTION,"Boiled egg coated with masala is stuffed in bun/bread.");
        cv.put(INGREDIENTS,"Bun - 2nos\n"+"Egg - 2 nos\n"+"Onion - 1 no(chopped)\n"+"Tomato - 1 no(chopped)\n"+"Ginger -garlic paste - 1 tsp\n"+"Green chilly - 1 no(chopped)\n"+"Garammasala - 1 tsp\n"+"Oil - As reqd\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"Boil eggs and keep aside.\n"+"Heat oil in a kadai, add onion and fry till transparent. Add ginger-garlic paste, green chilly, chopped tomato, garam masala powder and salt.\n"+"Cut boiled eggs into halves and add this to the masala. Mix well.\n"+"Make a slit in the side of the bun and stuff egg with masala inside.\n"+"Heat both sides of the stuffed bun. Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cherupayar Cutlet");
        cv.put(DESCRIPTION,"Easy and healthy cutlet.");
        cv.put(INGREDIENTS,"Cherupayar(Green gram) - 1 cup\n"+"Potato - 3 nos\n"+"Onion - 1 no\n"+"(chopped finely)\n"+"Ginger - 1\" piece\n"+"(chopped finely)\n"+"Greenchillies - 2 - 3 nos\n"+"(chopped finely)\n"+"Curryleaves - A few\n"+"Salt - As reqd\n"+"Pepperpowder - 1/4 tsp\n"+"Egg - 1 no\n"+"(beaten)\n"+"Bread slices - 2 - 3 nos(optional)\n"+"Breadcrumbs - 1/2 cup\n"+"oil for frying");
        cv.put(PROCEDURE,"Boil the potatoes and cherupayar separately.\n"+"Saute onions in a pan.\n"+"Add ginger, green chillies, curry leaves and cooked cherupayar-potato.\n"+"Mash and mix well.\n"+"Add salt.\n"+"Sprinkle pepper powder if required.\n"+"Add and mash the bread if there is more water in the mix.\n"+":- Adding bread gives a good taste also.\n"+"Flatten the mix into desired shapes.\n"+"Dip the mix in beaten egg, roll in bread crumbs and deep fry in oil.\n"+":- Serve hot with tomato ketchup.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cinnamon Rolls");
        cv.put(DESCRIPTION,"All purpose flour doughs layered with cinnamon and sugar.");
        cv.put(INGREDIENTS,"AllPurposeflour (Maida) - 2 cups\n"+"Active dry yeast - 1 tsp\n"+"Egg - 1 no\n"+"Melted butter - 3 tbsp\n"+"Milk - 1/2 cup\n"+"Sugar - 3 tbsp\n"+"Salt - a pinch\n"+"Brownsugar - 1 cup\n"+"Cinnamon powder - 1 1/2 tbsp\n"+"Butter - 2 tsp\n"+"Utensils:\n"+"Oven friendly tray greased with oil or butter.");
        cv.put(PROCEDURE,"Make a dough by mixing flour, egg, salt, sugar,melted butter and milk.\n"+":- Use milk slowly and as required as dough can become soggy.\n"+"Keep the dough ball in an oiled bowl and cover with a damp kitchen cloth and let it rise to twice its size(takes around an hour)\n"+"Dust your counter top with flour and roll out the dough to a rectangular shape of 1/2 cm thick.\n"+"Grease the dough bed with 2 tsp or more butter.\n"+"Make a mix of brown sugar and cinnamon powder and spread it on the greased dough bed.\n"+"Now from the smallest side, roll in the dough using your hands to a tight cylindrical shape.\n"+
                "Now you have a dough log /\n"+"cylinder.\n"+"Cut the log into slices of around 3 cm thickness.\n"+"Layer them on a greased tray with enough space between rolls and cover with damp cloth.\n"+"Let them sit for 15 minutes.\n"+"After 15 minutes bake them in the oven for 20 mts in 350F.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Egg Pepper Dry Fry");
        cv.put(DESCRIPTION,"A simple egg starter.");
        cv.put(INGREDIENTS,"Egg - 4 nos\n"+"Onion (small size) - 1 no\n"+"Pepperpowder - to taste\n"+"Salt - to taste\n"+"Greenchillies - 1 no\n"+"(sliced)\n");
        cv.put(PROCEDURE,"Boil the egg.\n"+"Cut the egg into 8 pices or smaller.\n"+"Heat oil in a pan and add finely chopped onions and saute well until it turns golden.\n"+"Add salt to this which makes it turn brown faster.\n"+"Sprinkle some pepper powder and fry for 30 seconds.\n"+"Add the egg into this mixture and fry well.\n"+"Keep adding pepper on top of the egg so that the egg is lightly covered with egg.\n"+"Keep frying.\n"+"Tips\n"+":- Do not over do the stir, make sure the egg is not powdered:-)\n"+":- The white of the egg and the yellow will be fried and start turning brown.\n"+":- Serve on a plate.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Egg Puffs");
        cv.put(DESCRIPTION,"A simple and easy recipe.");
        cv.put(INGREDIENTS,"Eggs - 2 nos\n"+"Puffs pastry sheets - 2 - 4 nos\n"+"Onion (small or medium) - 1 no\n"+"Ginger paste - 1/4 tsp\n"+"Garlic paste - 1/4 tsp\n"+"Egg masala - 1/2 tsp\n"+"Pepperpowder - 1/4 tsp\n"+"Salt - As reqd\n"+"Oil");
        cv.put(PROCEDURE,"Boil the eggs.\n"+"After cooling down, remove the shell and keep it aside.\n"+"Heat oil in a pan.\n"+"Add onion and salt. Saute well.\n"+"When it turns light brown, add ginger-garlic paste and mix well.\n"+"Add egg masala, garam masala and pepper powder into this mixture. Keep it aside.\n"+"Take out the puff pastry from the refrigerator half an hour before you start preparing the puffs.\n"+"Cut each egg vertically into two pieces.\n"+"Spread the masala mix onto the puff pastry and place half an egg on top of it.\n"+"Rub all the sides of the inner part of the pastry so that it acts as an adhesive.\n"+
                "Fold the puff pastry over the egg and seal it.\n"+"Preheat the oven to 400ªF and bake it for 10 - 15 mins.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Kozhukatt");
        cv.put(DESCRIPTION,"Homemade Sweet Kozhukatta.");
        cv.put(INGREDIENTS,"Rice flour : 1 cup\n"+"Coconut : ½ cup\n"+"Jaggery : ½ cup\n"+"Salt : to taste\n"+"Water : as needed\n"+"Oil : 1tsp ");
        cv.put(PROCEDURE,"Grate jaggery first and then heat a pan add oil to it and add jaggery to it.\n"+"Allow it to get melt.\n"+" Then add coconut to it."+"\n When it sauted well ,off the flame.\n"+"Then heat another pan add water to it and when it boils add rice flour and salt,stir well and off the flame.\n"+"Then make it a smooth dough.\n" + "Take little from the dough and make it flat.\n"+"To this add little of coconut matter.\n"+"Then close it by making ball shaped or as u like.\n"+"Then using a steamer or idli maker cook it.\n"+"Serve hot or chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ada Dosa");
        cv.put(DESCRIPTION,"Tastes very good when crispy and hot.");
        cv.put(INGREDIENTS,"Rawrice - 1/2 cup\n"+"Boiled rice - 1 cup\n"+"Bengalgram (Kadalaparippu) - 1/4 cup\n"+"Red and Black gram(Thuvaraparippu and Uzhunnuparippu both together) - - 1/4 cup\n"+"Oil\n"+"Onion (medium) - 2 nos\n"+"Red chillies or powder - 3 - 4 nos or as reqd\n"+"Asafoetida(Kayam) powder - 1/4 tsp\n"+"Curryleaves - 2 stems\n"+"Corianderleaves - 2 sprigs\n");
        cv.put(PROCEDURE,"Soak the rice and daals for few hours.\n"+"Grind coarsely all the ingredients except for one onion and add salt to your taste to the batter.\n"+"Chop finely the other onion and add it to the batter and make it into a consistency of dosa batter.\n"+"Make nice thin dosas, pour oil on the sides and make it crispy.\n"+":- Serve with Pudhina chutney.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Adhirasam");
        cv.put(DESCRIPTION,"A sweet snack made with rice flour and jaggery");
        cv.put(INGREDIENTS,"Riceflour (Ari podi) - 2 cups\n"+"Jaggery (Sharkkara) powdered -1 cup\n"+"Water - 1/2 cup\n"+"Cardamom (Elakka) powder - 1 tsp\n"+"Ghee - 1/2 tsp\n"+"Oil for frying");
        cv.put(PROCEDURE,"Melt the jaggery in water till it reaches the desired consistency(see test for consistency below).\n"+"Add cardamom and ghee to the gravy and mix again.\n"+"Make the mixture into flat patties.\n"+"Heat oil in a pan.\n"+"Deep fry the patties in oil.\n"+"Test for the right consistency :\n"+"If you put a little melted jaggery in a little water, it should roll up into a soft ball.\n"+"If you hit the ball on the vessel, it should produce a metallic sound.\n"+"Immediately turn the stove off and pour it on the flour.\n"+"Mix well. It`ll become a thick gravy.\n"+"Even if the gravy is watery, it will harden eventually on stirring.\n"+
                "Some tips :\n"+"The whole deep frying process should be done on low heat.\n"+"The gravy can be refrigerated in an air-tight container and can be used for making fresh adhirasams for about a week`s time.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aloo Bonda");
        cv.put(DESCRIPTION,"Fried potato stuffing .");
        cv.put(INGREDIENTS,"Potatoes - 500 gm\n"+"(boiled and mashed)\n"+"Onion (medium) - 2 nos\n"+"Greenchillies - 5 nos\n"+"Ginger -garlic paste - 50 gm\n"+"Gramflour (Kadala podi) - 250 gm\n"+"Water - 2 cups\n"+"Cuminseeds (Jeerakam) - 2 tsp\n"+"Mustardseeds - 1 tsp\n"+"Tamarind (Puli) - 50 gm or dry mango powder(Amchur)\n"+"Jaggery (Sharkkara) - A small piece\n"+"Corianderleaves - 3 stalks\n"+"Red chilly powder - A pinch\n"+"Turmericpowder - A pinch\n"+"Baking soda - A pinch\n"+"Salt - As reqd\n"+"Asafoetida(Kayam) powder - A pinch\n"+"Oil for frying\n");
        cv.put(PROCEDURE,"Sieve gram flour or besan.\n"+"Add 3/4 tsp salt, 1 tsp of cumin seeds, a pinch of red chilly powder, a pinch of turmeric powder, 1/4 tsp of asafoetida and a pinch of baking soda.\n"+":- Too much of asafoetida can create strong and pungent smell. It will defy the taste..so add a bit.\n"+"Mix together to make a thick and a smooth paste, using water.\n"+"Heat 3 tsp of oil in a deep bottomed frying pan.\n"+"Splutter mustard seeds, cumin seeds, ginger-garlic paste, green chillies and onion.\n"+"Fry until the onions become translucent.\n"+"Add mashed potatoes and salt and mix well.\n"+
                "Add fresh coriander leaves and simmer for 2-3 mins.\n"+"Take a small vessel and add tamarind pulp and jaggery.\n"+"Simmer on low flame.\n"+"Add this to the potato mixture.\n"+"If using amchur powder, you can directly add 1-2 tsp of amchoor powder to the mixture.\n"+"Make small balls off the mixture.\n"+"Dip in the besan batter and deep fry.\n"+":- Serve with coconut/pudhina chutney/tomato sauce.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American Chocolate Roll");
        cv.put(DESCRIPTION,"A simple Chocolate Roll for kids.");
        cv.put(INGREDIENTS,"Nuts - 1 cup\n"+"(cut into small pieces)\n"+"Biscuits - 12 pieces\n"+"(broken into small pieces)\n"+"Chocolate powder - 3 tbsp\n"+"(like boost viva etc)\n"+"Coconut powder(Thenga peera) -1 1/2 cups\n"+"Condensed milk ");
        cv.put(PROCEDURE,"Mix together all the ingredients.\n"+"Pour a little condensed milk to make a small dough.\n"+"Roll it into cylinder shape.\n"+"Cover it with aluminium foil.\n"+"Refrigerate.\n"+"Cut it into small round shapes.\n"+":- Serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bread Baji");
        cv.put(DESCRIPTION,"A tea-time snack.");
        cv.put(INGREDIENTS,"Bread - 3 slices\n"+"GramFlour (Kadalamavu) - 1 cup\n"+"ChilliPowder - 1 tsp\n"+"Salt - 1/2 tsp\n"+"Asafoetida(Kayam) powder - 1/4 tsp\n"+"Oil for frying");
        cv.put(PROCEDURE,"Mix together gram flour, salt, chilli powder and asafoetida with water to make a loose batter.\n"+"Cut the brown portions of the sides of the bread slices.\n"+"Cut each slice of bread into four pieces.\n"+"Dip each piece of bread into the batter and deep fry until it is fully cooked.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Channa Batura");
        cv.put(DESCRIPTION,"Chickpeas(Vella kadala) gravy to go with big poories.");
        cv.put(INGREDIENTS,"For batura:-\n"+"Allpurposeflour (Maida) - 2 cups\n"+"Milk - 1 cup\n"+"Curd - 1/2 cup\n"+"Bakingpowder - 1/2 tsp\n"+"Sugar - 2 tsp\n"+"Salt - As reqd\n"+"Oil for deep frying\n"+"For channa:-\n"+"Chick peas(Kabuli kadala) - 1 cup\n"+"Onion (large) - 1 no\n"+"Tomato - 1 no\n"+"(finely chopped)\n"+"Greenchillies - 2 nos\n"+"(finely chopped)\n"+"Ginger -garlic paste - 1 tbsp\n"+"Chillypowder - 1 tsp\n"+"Corianderpowder - 2 tsp\n"+"Turmericpowder - 1/2 tsp\n"+"Garam masala powder - 1 tsp\n"+"Cuminseeds (Jeerakam) - 1 tsp\n"+"Spices - 2 each\n"+
                "Oil - 1/4 cup\n"+"Salt - As reqd\n"+"Coriander leaves for garnishing");
        cv.put(PROCEDURE,"For making batura:-\n"+"Mix together all the ingredients for making batura.\n"+"Knead them together to make a smooth dough.\n"+"Keep it aside atleast for 1 hour.\n"+"Make medium sized balls off the dough.\n"+"Roll them out to thick big poories.\n"+"Deep fry them in oil.\n"+"For making channa:-\n"+"1)Soak the channa overnight.\n"+"Pressure cook it, till done.\n"+"Grind onion to a smooth paste.\n"+"Heat oil in a pan or a kadai.\n"+"Splutter cumin seeds and spices(cloves, cardamom and cinnamon).\n"+"Add onion paste and ginger-garlic paste and saute, till the oil starts to separate.\n" +
                "Add all powders and salt and saute for a few seconds.\n"+"Add tomatoes and green chillies and saute, till the tomatoes blend well.\n"+"Add the cooked channa and mix well.\n"+"Cook, till the gravy thickens.\n"+"Garnish with coriander leaves.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Kachori");
        cv.put(DESCRIPTION,"Kachori.");
        cv.put(INGREDIENTS,"For the stuffing:-\n"+"Blackgram (Uzhunnuparippu) - 50 gm\n"+"Greengram (Cheruparippu) - 100 gm\n"+"Greenchillies - 3 - 4 nos\n"+"Ginger - 1 inch piece\n"+"Oil - 2 tsp\n"+"Turmericpowder - 1/2 tsp\n"+"Red chilly powder - 1/2 tsp\n"+"Corianderpowder - 1 tsp\n"+"Salt - 1/2 tsp\n"+"Cumin(Jeerakam) powder - 1/2 tsp\n"+"Lime - Half of one\n"+"Corianderleaves - As reqd\n"+"For the kachoris:-\n"+"Allpurposeflour (Maida) - 2 cups\n"+"Salt - 1/2 tsp\n"+"Oil - 1 tsp");
        cv.put(PROCEDURE,"Soak both the dals for 2 hours.\n"+"Grind them into a slightly coarse paste.\n"+"Put this mixture on an idli plate and steam in a large vessel (as for idlis).\n"+"Remove them from the plate and allow to cool in a large vessel or plate.\n"+"Make a paste of green chillies and ginger and keep it aside.\n"+"In a pan, heat oil and add turmeric powder, red chilly powder, coriander powder, cumin seeds powder.\n"+"Add 1 tsp of chillie-ginger paste and fry. To this, add the prepared mixture.\n"+
                "Squeeze out 1/2 lime on it.\n"+"Add few coriander leaves and mix well.\n"+"For the kachoris:-\n"+"1)Mix maida and salt by adding water little by little until the dough becomes tight.\n"+"Keep this dough in a wet cloth and cover it for 10 min.\n"+"Make small balls of this dough and flatten them.\n"+"Place stuffing on this and close the ends.\n"+"Deep fry in oil.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Maida Cuts");
        cv.put(DESCRIPTION,"Maida Cuts.");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 500 gm\n"+"Red chilly powder - 1 tsp\n"+"Salt - 1 tsp\n"+"Asafoetida(Kayam) powder - A pinch\n"+"Ghee - 1 tbsp\n"+"Cooking oil for deep frying - 1/2 kg ");
        cv.put(PROCEDURE,"Mix together maida, salt, red chilly powder, asafoetida, ghee or oil and knead well to make a soft dough.\n"+"Make balls off the dough and roll them into very thin & large chappathis.\n"+"Make cuts using a knife by drawing a number of parallel lines to cut into diamond shaped pieces.\n"+"Deep fry in oil.\n"+"Drain and pack in a air-tight container for longer shelf life.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bachelors Bread Toast");
        cv.put(DESCRIPTION,"Very easy to make and tasty too. .Can be given as a evening snack to kids..");
        cv.put(INGREDIENTS,"Bread slices - 6 nos\n"+"Egg - 2 nos\n"+"Milk - 1 small cup\n"+"Sugar - as reqd");
        cv.put(PROCEDURE,"Boil milk and let it cool.\n"+"Add egg into it and beat.\n"+"Add enough sugar.\n"+"Soak Bread Pieces in to it.\n"+"Heat a tava in mediam flame with out any oil or ghee.\n"+"Keep the bread slices on the tava.\n"+"After 1 minute, turn it over and fry the other side too.\n"+":- Your Tasty Toast is Ready!!!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Baked Oatmeal");
        cv.put(DESCRIPTION,"Baked Oatmeal");
        cv.put(INGREDIENTS,"Oats – 5 cups\n"+"Milk - 2 ½ cups\n"+"Eggs - 4 nos\n"+"Honey - ½ cup\n"+"Bakingpowder - 1 tbsp\n"+"Cinnamon – 1 tsp\n"+"Salt - A pinch\n"+"Vanilla - 1 tsp\n"+"Raisins - ½ cup");
        cv.put(PROCEDURE,"Mix all together.\n"+"Pour into non greased 9x13 pan.\n"+"Bake at 350ªF for 30 min until lightly browned.\n"+":- This can be made the night before.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Banana Dosa");
        cv.put(DESCRIPTION,"Sweet dosas made with bananas..");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 250 gm\n"+"Bananas(mashed) - 4 nos\n"+"Egg - 1 no\n"+"Sugar - 75 gm\n"+"Cardamom (Elakka) powder - 2 gm\n"+"Bakingpowder - 1/4 tsp\n"+"Milk - 1 1/2 glass\n"+"Oil - 50 gm");
        cv.put(PROCEDURE,"Beat the egg well and add sugar, milk and mashed bananas. (These ingredients can also be mixed in a blender.)\n"+"Take the maida in a bowl and the above mixture into it.\n"+"Mix well to form a dosa batter.\n"+"Add cardamom powder and baking powder to the batter and mix well.\n"+"Heat a flat pan and make thin dosas.\n"+"Fry on both sides until golden brown in colour with little oil.\n"+":- Serve hot with any juice.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Battalappam");
        cv.put(DESCRIPTION,"Steamed appam - famous recipe..");
        cv.put(INGREDIENTS,"Eggs - 5 nos\n"+"Coconut milk - 2 cups\n"+"Sugar - 1/2 cup\n"+"Jaggery (Sharkkara) syrup - 1/2 cup\n"+"Cashew(sliced) - 1/4 cup\n"+"Ghee - 1 tbsp\n");
        cv.put(PROCEDURE,"Mix together eggs, coconut milk and syrup and beat in a mixer.\n"+"Add cashew slices.\n"+"Pour the above mixture into a plate greased with ghee.\n"+"Keep the plate in a appam cooker(appa chembu).\n"+"Cook for 30 mins.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Egg Sandwich");
        cv.put(DESCRIPTION,"A delicious breakfast");
        cv.put(INGREDIENTS,"Egg - 2 nos\n"+"White/wheat bread - 4 nos\n"+"Potato - 1 no(mashed)\n"+"Mayonnaise - 1 tbsp\n"+"American garden salad dressing - 2 tbsp\n"+"Salt - As reqd\n"+"Pepper - As reqd ");
        cv.put(PROCEDURE,"For preparing potato-egg sandwich, first make bulls eye with egg. Keep this aside.\n"+"Mash potato and mix mayonnaise, salad dressing, little salt and pepper.\n"+"Toast the bread slices in greased tawa, spread the potato mix in it.\n"+"Place the egg on it and place other bread slice on top.\n"+"Potato - egg sandwich a tasty break fast is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chatti Pathiri");
        cv.put(DESCRIPTION,"A traditional malabar cuisine");
        cv.put(INGREDIENTS,"Semiya - 400 gm\n"+"Coconut - 2 nos\n"+"(Grind 2 coconuts with 1 cup water)\n"+"Eggs - 8 nos\n"+"Vanaspathi - 100 gm\n"+"Cardamom - 8 nos\n"+"Karinjeerakam - 1/2 tsp\n"+"Sugar - 500 gm\n"+"Onion - 1 no\n"+"Almonds and Raisins - 4 tbsp\n"+"Salt - As reqd");
        cv.put(PROCEDURE," Mix the egg with sugar, coconut milk, salt and karinjeerakam.\n"+"Boil it in a bottom thick vessel still it boils well stirring it continuously. Keep it aside.\n"+"Roast semiya till it turns brown in color.\n"+"Fry the sliced onion in oil. After they turn brown, add raisins and almond in it. Fry it and keep it aside.\n"+"Place the semiya mixture and fried onion, raisins and almonds layer by layer in a bottom thick vessel.\n"+"Cook it covered for 30 - 45 minutes on low flame.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Kappa & Beef");
        cv.put(DESCRIPTION,"traditional kerala recipe");
        cv.put(INGREDIENTS,"Tapioca - 500 g\n"+"Water - as required\n"+"Salt - to taste\n"+"Beef - 350 g\n"+"Onion - 2\n"+"Green chilly - 2\n"+"Tomato - 1\n"+"Curryleaves - as required\n"+"Garammasala - 1/2 tsp\n"+"Turmericpowder - 1/2 tsp\n"+"Chillypowder - 1 tsp\n"+"Salt - to taste\n"+"Water - as required\n"+"Corianderpowder - 1 ½ tsp\n"+"Grinded coconut - 1 ½ cups\n"+"Coconutoil - as required");
        cv.put(PROCEDURE,"Cook the tapioca with water, salt and a pinch of turmeric powder. Drain and keep it aside.\n"+"In a pressure cooker sautT onion and green chilly in coconut oil.\n"+"Add tomato, coriander leaves and curry leaves and sautT again.\n"+"Mix in the garam masala, beef, turmeric powder, chilly powder, coriander powder, salt and water as required. Stir well and cook it with closed lids. 3-4 whistles may be enough.\n"+"Mix in the cooked tapioca, grinded coconut and curry leaves with the beef curry.\n"+
                "Stir well and simmer in low flame for 5 minutes.\n"+"Serve it with pickle.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Appam & Potato Stew");
        cv.put(DESCRIPTION,"Easy unniyappam in malabar style.");
        cv.put(INGREDIENTS,"Rawrice -1/2 kg\n"+"Jaggery - 3/4 kg\n"+"Banana (medium size) -1 Number\n"+"Maida -50 gm\n"+"oil - for frying purpose\n"+"Wet raw rice until 3/4 hours");
        cv.put(PROCEDURE,"Wet raw rice until 3/4 hours\n"+"Powedered by using mixer grinder as nice powder\n"+"Melt & clean jaggery and keep cool\n"+"Cut the banana into small pieces and grind it well with jaggery paste Put rice powder to it and mix well. Make the paste ( dosa maavu paakam) if it is so loose add maida .\n"+"Kept the mixture 20 minutes\n"+"Fry it as usual unniyappam make by using unniyappa kaara\n"+"Make appox. 50 unniappam by using this mixture\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Banana Puttu");
        cv.put(DESCRIPTION,"A special type of puttu prepared with banana and coconut.");
        cv.put(INGREDIENTS,"Coconut - 1 no(grated)\n"+"Roasted rice flour(Puttu powder) - 4 cups\n"+"Salt - As reqd\n"+"Banana - 5 nos(sliced small)\n"+"Sugar - 2 tsp\n"+"Cardamom powder(Elakka) - 1/4 tsp\n"+"Ghee - 1 tsp");
        cv.put(PROCEDURE,"For preparing banana puttu, mix the ingredients: puttu powder, salt, sugar and cardamom powder by sprinkling required water to make the puttu maavu.\n"+"Mix the ingredients: coconut, banana and ghee in another bowl.\n"+"Make the banana puttu in steam by adding the banana mixture in between the puttu in place of coconut.\n"+"Banana puttu is ready. Serve hot.\n"+"Specialities:\n"+"1)Innovative recipe.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Barley Dosa");
        cv.put(DESCRIPTION,"Crispy dosa with Barley and rice.");
        cv.put(INGREDIENTS,"Rice - 1 cup\n"+"Barley - 1 cup\n"+"Blackgram (Uzhunnu/Urad dal) - 1 cup\n"+"Salt - As reqd\n"+"Olive oil or sesame oil");
        cv.put(PROCEDURE,"Soak the rice, barley and urad overnight or atleast for 8 hrs.\n"+":- The barley takes a long time to soak.\n"+"Grind the urad dal separately first and then the rice and barley together with water only as much as needed so as to not make it too\n"+"watery.\n"+"When the batter is smooth and done, mix the urad and the rice barley batter together.\n"+"Add the salt and let it undisturbed in a warm place for around 8 hrs.\n"+"When the batter rises, mix gently, adjust the water consistency and take a ladle and pour it on the tava.\n"+
                ":- If u like it crispy pour it a little cold (from the fridge).\n"+"Pour olive or sesame oil around the sides and leave it on low-medium flame.\n"+"Once brown and cooked, remove it without overturning it.\n"+":- Do not touch the dosa till its done or it tears on the sides.\n"+":- Serve hot with peanut chutney or any chutney.\n"+":- Healthy breakfast for kids and adults.\n"+":- Can substitute white rice with brown rice also.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cabbage Dosa");
        cv.put(DESCRIPTION,"Dosa made with cabbage and coconut.");
        cv.put(INGREDIENTS,"Cabbage - 1/4 kg\n"+"(shredded)\n"+"Rawrice (pachari) - 1/4 kg\n"+"Grated coconut - 1/2 cup\n"+"Chillypowder - 2 tsp\n"+"Turmericpowder - 1/4 tsp\n"+"Asafoetida(Kayam) - 1/4 tsp\n"+"Salt - As reqd\n"+"Oil for applying on the tawa");
        cv.put(PROCEDURE,"Boil the shredded cabbage.\n"+"Soak rice for 2 hours and grind it.\n"+"Add the cooked cabbage, coconut, chilly powder, turmeric powder, asafoetida and salt. Mix well.\n"+"Make dosas instantly.\n"+":- The batter should be poured a bit thick.\n"+"Apply oil on the sides and cover the pan and cook your dosa.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Crispy Paniyaram");
        cv.put(DESCRIPTION,"Ideal for breakfast or Snack time.");
        cv.put(INGREDIENTS,"Idli Batter - 1/2 kg\n"+"Onions(big) - 2 nos\n"+"(chopped)\n"+"Greenchillies - 4 nos\n"+"Ginger - 1 big piece\n"+"Asafoetida(Kayam) powder - A pinch\n"+"Mustardseeds\n"+"Dry red chillies(Kollamulaku) - 4 nos\n"+"Bengalgram (Kadalaparippu) - 1 tbsp\n"+"Splitblackgram (Uzhunnuparippu) - 1 tsp\n"+"Rawrice - 2 tbsp\n"+"Curryleaves\n"+"Oil\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"Soak raw rice for about half an hour and grind it with ginger and green chillies.\n"+"Pour mixture into idli batter.\n"+"Heat oil in a pan or a kadai.\n"+"Splutter mustard seeds followed by black gram and Bengal gram and slighty fry.\n"+"Add the red chillies, onions and curry leaves, a pinch of asafoetida powder and fry till golden brown.\n"+"Add salt as per taste.\n"+"When the onions look nice and crispy brown, take it off fire and add the mixture in to the batter and mix all the ingredients well.\n" +
                "Heat oil in the Paniyaram pan and pour the batter.\n"+":- Hot Crispy Paniyarams will be ready in no time.\n"+":- Serve hot with coconut chutney.\n"+":- Remember that the batter would already have salt in it so add salt accordingly.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Biryani");
        cv.put(DESCRIPTION,"very tasty malabar style biryani..");
        cv.put(INGREDIENTS,"Biriyani rice-1kg\n"+"Beef -500g\n"+"Onion -5\n"+"Green chilly-4\n"+"Ginger -small piece\n"+"Garlic -6\n"+"Tomato -4\n"+"Turmericpowder -1/4 tsp\n"+"Garammasala -1 tsp\n"+"Salt -as required\n"+"Corianderleaves -as required\n"+"Water -as required\n"+"Oil -as required\n"+"Cardamom -2\n"+"Cinnamon stick-small piece\n"+"Curryleaves -as required\n"+"Chillypowder -1/2 tsp\n"+"Beef masala-1 tsp");
        cv.put(PROCEDURE,"Grind green chilly, ginger and garlic to make a paste.\n"+"Heat oil in a big bottom thick vessel.\n"+"SautT + pc of onion, cinnamon, bay leaf and cardamom till the onion turn deep brown in colour. Take it from the oil and keep it aside.\n"+"Pour water, salt and + tsp of garam masala and let it boil.\n"+"Once the water boils add the biryani rice and let it cook with closed lids till the water drains. In between mix in the pure ghee with the rice. Take it from flame and keep it aside.\n"+"Fry cashewnut and raisins in pure ghee and keep it aside.\n" +
                "In a pressure cooker sautT onion, salt, + tsp garam masala, coriander leaves in 2-3tbsp of oil and 2tsp of pure ghee.\n"+"Add tomato and sautT again.\n"+"Then add the beef, green chilly paste and mix well.\n"+"Then add + tsp of garam masala and cook it with closed lids for 15-20 minutes or till the beef gets well cooked. Shut the flame.\n"+"Open the lid and mix in the lemon juice.\n"+"Now place a piece of aluminium foil or banana leaf on top of the beef masala.\n"+"Spoon in some rice and sprinkle the sautTed onion and cashew-raisins on top of it. Repeat the procedure till the rice reaches the top of the cooker. Close the lid and cook it in low flame. This procedure is called µdum¦ . its done to bring the flavor of the masala to the rice.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Burger");
        cv.put(DESCRIPTION,"Easy to make at home...");
        cv.put(INGREDIENTS,"Butter - 30 gm\n"+"Ground Beef (raw) - 1 kg\n"+"Egg yolk - 1 no\n"+"Onion (medium) - 1 no\n"+"(chopped)\n"+"Parsley - 30 gm\n"+"(chopped)\n"+"Salt - As reqd\n"+"Pepper - As reqd\n"+"Burger Bun - 4 nos");
        cv.put(PROCEDURE,"Put ground beef into a mixing bowl.\n"+"Add chopped parsley, onion to the ground beef and mix together.\n"+"Add the egg yolk and mix well.\n"+"Add seasoning.\n"+"Break mix into 4 equal sized balls and on a flat surface pat the balls into round flat circles.\n"+"Keep in freezer for atleast 12 hrs in order to make it firm.\n"+"Preheat a little butter in a pan.\n"+"Gently fry burgers on both sides until cooked through.\n"+"Cut the burger from middle and toast the inside.\n"+"Spread a little butter/mayonise/ketchup on inside of the bun.\n"+"While warm add the burger.\n"+":- Serve with french fries and salad.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Curry");
        cv.put(DESCRIPTION,"Kerala style naadan beef curry..");
        cv.put(INGREDIENTS,"Beef boneless : ½ k gm\n"+"Garlic ginger paste : 1 tsp\n"+"Coriander powder : 2 tsp\n"+"Jeera powder : 1 tsp\n"+"garam masala powder : 1 tsp\n"+"Turmeric powder : ½ tsp\n"+"red chilli powder : 2 tsp\n"+"Onions finely sliced : 2 medium size\n"+"Coconut milk : ½ a coconut\n"+"Curry Leaves ; few\n"+"Salt : to taste\n"+"Oil : 2 - 3 tsp");
        cv.put(PROCEDURE,"Marinate the beef with all the dry masala and garlic ginger paste. Keep aside for 30 minutes.\n"+"Cook the beef in the pressure cooker 10 whistles with one glass water.\n"+"Fry the sliced onions till soft, add the curry leaves and the cooked beef.\n"+"Enter Step\n"+"Enter Step\n"+"Enter Step\n"+"Dry out all the excess water. (You can remove the beef and dry out the water so that the masala paste is left.)\n"+"When it is dry add the cooked beef pieces and the coconut milk and bring to a boil.\n"+"Enter Step\n"+"Garnish with coriander leaves and serve with rice / kerala paratha.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Finger Rolls");
        cv.put(DESCRIPTION,"A beautiful party dish..");
        cv.put(INGREDIENTS,"Beef (minced) - 1 lb\n"+"Onion (medium) - 1 no\n"+"(finely diced)\n"+"Tomato (medium) - 1 no\n"+"(deseeded and finely diced)\n"+"Ginger and garlic(crushed) – ½ tsp\n"+"Bay leaf(Vazhana/Karuga ela) – 1 tbsp\n"+"Cumin(Jeerakam) powder – 1 tbsp\n"+"Bakingpowder - 1/3 tsp\n"+"Breadcrumbs - 3 tbsp\n"+"Greenchillies (crushed) - 2 -3 nos\n"+"Salt - As reqd\n"+"Red pepper – As reqd\n"+"Corianderpowder - As reqd\n"+"Corianderleaves (finely chopped)\n"+"Egg - 1 no\n");
        cv.put(PROCEDURE,"Mix well all the above ingredients.\n"+"Make them into finger shape long rolls with the palm of your hand, at least 3 to 4 inches long because they will shrink during frying.\n"+"You can also bake it in the oven by placing the rolls on the baking sheet.\n"+"Heat the oven to 300 degrees and put then for about 15 to 20 minutes.\n"+"The rolls should not become brown.\n"+":- Serve hot with naan and raita.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Fry");
        cv.put(DESCRIPTION,"It is quite a spicy dish too..");
        cv.put(INGREDIENTS,"Beef : 2 k gm\n"+"Chili powder : 3 tsp\n"+"Turmeric powder : 2 tsp\n"+"Chopped Onion : 3 nos\n"+"Garlic : 10 or 12 pieces\n"+"Ginger paste : 1 tsp\n"+"Curry leaves : 4 or 5 leaves\n"+"Salt : as reqd\n"+"Oil : as reqd");
        cv.put(PROCEDURE,"Cut the beef into small pieces and clean them with water.\n"+"Put chili powder, turmeric powder and salt into the beef and mix them well.\n"+"Take a cooker. Pour some oil and add the beef mixture and some water to it.\n"+"Cook them for some time till it becomes dry.5) Take a pan. Pour some oil and add chopped onion, garlic, ginger paste and curry leaves to it. Scatter a small amount of salt. Stir them for a while.\n"+"Add the cooked beef to it and add some water to it.\n"+"Stir the mixture continuously till the whole water becomes dry and all the mixture get mixed well.8) Add some more curry leaves and off the gas stove. 9) Put the beef fry in a plate and serve it. You can use them with chapattis or dosa.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Mappas");
        cv.put(DESCRIPTION,"Hot and Spicy Beef preapred with Coconut Milk..");
        cv.put(INGREDIENTS,"Beef - 1 kg\n"+"(Thin-long slices)\n"+"Coconut - 1 no\n"+"(Grated)\n"+"Onion (small) - 15 nos\n"+"Greenchillies - 6 nos\n"+"Curryleaves - 1 strip\n"+"Ginger - 1 small piece\n"+"Garlic - 3 nos\n"+"Cardamon - 4 nos\n"+"(Slightly crushed without removing the skin)\n"+"Cinnamon – 1 small stick\n"+"(Slightly crushed )\n"+"Cloves - 6 nos\n"+"Anise seed - 2 pinch\n"+"Red chilli powder - 1 tsp\n"+"Corianderpowder - 1/4 tsp\n"+"Turmericpowder - 1/4 tsp\n"+"Vinegar - 1 tbsp\n"+"Cooking oil - 6 tbsp");
        cv.put(PROCEDURE,"Pour the cooking oil into a pan and when its hot put small onion,Green chillies, Curry leaves, Ginger and Garlic.\n"+"Saute for some time till they become golden brown.\n"+"Make a paste of Red chilli powder, pepper powder, Coriander powder & Turmeric powder.\n"+"Add Cardamon, Cinnamon, Cloves- and Anise seed.\n"+"Take coconut milk from the grated coconut(\"thala paal\") and keep it aside.\n"+"Mix more water with the left over grated coconut and take the milk again from it (\"eda paal\") in another bowl.\n"+"Add the \"eda paal\" to the above along with the beef pieces and salt for taste.\n"+"When cooked and the sauce has turned thick.\n"+"Add the \"thala paal\" and vinegar.\n"+"Bring to boil and \"Beef Pappas\" is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beef Olatherachi");
        cv.put(DESCRIPTION,"Dry roasted beaf..");
        cv.put(INGREDIENTS,"Oil\n"+"Beef - 1 kg\n"+"Onion - 100 gm\n"+"Ginger -garlic paste - 4 tsp\n"+"Chillypowder - 1 tbsp\n"+"Corianderpowder - 1 tbsp\n"+"Pepper - 1/4 tsp\n"+"Turmericpowder\n"+"Salt - As reqd\n"+"Garammasala - 1 tsp\n"+"Coconut slivers");
        cv.put(PROCEDURE,"In a pressure cooker, heat coconut oil.\n"+"Deep fry the finely chopped coconut and remove. Keep it aside.\n"+"Add ginger-garlic paste, onion, beef, chilly powder, coriander powder, turmeric powder, pepper, garam masala and salt.\n"+"Add little water into it and cook upto 8 whistles.\n"+"Heat coconut oil in another large vessel.\n"+"Splutter mustard seeds and saute curry leaves.\n"+"Add fried coconut and cooked beef.\n"+"Dry roast as reqd.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chicken Munch");
        cv.put(DESCRIPTION,"Dry chicken Munching at party table..");
        cv.put(INGREDIENTS,"Chicken pieces with bones - 1 kg\n"+"Cornflour - 100g\n"+"Maida flour - 50g\n"+"Ginger -garlic paste - 2 tbsp\n"+"Red chilly powder - 2 tbsp\n"+"Turmericpowder - 1 tsp\n"+"Egg - 1 no\n"+"Bread powder - 1 cup\n"+"Salt - As reqd\n"+"Refined oil - 350 ml\n"+"Curryleaves - Few\n"+"Greenchillies - 10 nos");
        cv.put(PROCEDURE,"Mix corn flour, maida flour, egg white and salt in a bowl to prepare thick dough.\n"+"Apply ginger garlic paste, red chilly powder, turmeric powder and some salt to the chicken pieces and marinate for one hour.\n"+"Dip the chicken pieces in the dough and roll in the bread powder.\n"+"Take oil in a frying pan and boil.\n"+"Reduce the flame and fry the chicken pieces until it turns to deep brown.\n"+"In the same oil, fry some curry leaves and length wise split green chillies and sprinkle them over the fried chicken pieces.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chicken Sticks");
        cv.put(DESCRIPTION,"Chicken Sticks - A Perfect starter");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 1 tbsp\n"+"Cornflour - 2 tbsp\n"+"Egg - 1 no\n"+"Red orange color - 1/2 tsp\n"+"Oil for deep frying\n"+"Potatoes (big) - 3 nos\n"+"Tooth picks(Not plastic)\n"+"For Marination:-\n"+"Boneless Chicken - 250 gm\n"+"(1 inch pieces)\n"+"Ginger -garlic paste - 2 tsp\n"+"Red chili powder - 2 tsp\n"+"Ginger (chopped) - 1 tbsp\n"+"Garlic (chopped) - 1 tbsp\n"+"Corianderleaves (chopped) - 1 tbsp\n"+"Garam Masala powder - 1 tsp\n"+"Lemon juice - 1/2 slice\n"+"China Salt(Ajinomotto) - 1 tsp\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"Mix all the ingredients given for marination and marinate it over night.\n"+"Add maida, corn flour, red orange color and egg to it.\n"+":- Egg acts as coating to the chicken pieces.\n"+"Peel the potatoes and slice them as chips, but little thicker.\n"+"Take a slice, keep a chicken piece on it, fold the potato slice a bit and pierce them together using tooth pick.\n"+"Heat oil in a pan or a kadai.\n"+"Deep fry the chicken pieces on a low flame in batches.\n"+":- Serve hot by adding some lemon juice on it to make it more tasty.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chili Chicken");
        cv.put(DESCRIPTION,"Chili chicken karahi..");
        cv.put(INGREDIENTS,"Boneless chicken breast fillets - 500 gm\n"+"Long green chillies(slit ) - 4 nos\n"+"Oil for cooking\n"+"Salt - As reqd\n"+"Chillypowder - 1 tbsp\n"+"Ginger paste - 1 tsp\n"+"Garlic paste - 2 tsp\n"+"Corianderpowder - 1 tsp\n"+"Kalonji (Onion seeds) - 1/2 tsp\n"+"White cumin seeds - 1/2 tsp\n"+"Juice of 2 lemons\n"+"Onions - 2 nos\n"+"(chopped)\n"+"Tomato - 2 nos\n"+"(chopped)\n"+"Curryleaves - A few\n"+"Corianderleaves (chopped) - 3 tbsp");
        cv.put(PROCEDURE,"Marinate chicken for 20 minutes with juice of 1 lemon and 1 tsp garlic paste.\n"+"Remove seeds from 2 green chillies and lightly fry in oil. Keep them aside.\n"+"Heat oil in a pan.\n"+"Add curry leaves, kalonji, cumin seeds and cook for 2 minutes.\n"+"Add all remaining spices, ginger, garlic, onions, little water and cook for 3 to 4 minutes. (Do not burn masala.)\n"+"Add chicken and fry until brown.\n"+"Add tomatoes and cook for few minutes on high flame.\n"+"Cover and cook till almost tender for 10 to 12 minutes.\n"+"Add fried green chilies, coriander leaves, juice of the remaining lemon and simmer for 5 to 6 minutes.\n"+"Garnish with ginger juliennes, green chilies and lemons.\n"+":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Achari Murgh");
        cv.put(DESCRIPTION,"Spicy and hot Chicken - cooked in spicy North Indian style..");
        cv.put(INGREDIENTS,"Chicken - 1 kg\n"+"(any pieces of your choice with the skin removed)\n"+"Fenugreekseeds (Uluva) - 1 tsp\n"+"Mustardseeds - 1 tsp\n"+"Aniseed/Fennel seeds(Perinjeerakam) - 1 tsp\n"+"Cuminseeds (Jeerakam) - 1 tsp\n"+"Onion seeds(Kalonji) - 1 tsp\n"+"Red chilli powder - 1 tsp\n"+"Turmericpowder - 1 tsp\n"+"Greenchillies - 6 nos\n"+"Onions(large) - 2 nos\n"+"(sliced thin)\n"+"Garlic paste - 2 tsp\n"+"Ginger paste - 1 tsp\n"+"Yoghurt - 1 cup\n"+"Juice of 1 lime/lemon\n"+"Salt - As reqd\n"+"Vegetable/Canola/Sunflower oil - 3 tbsp");
        cv.put(PROCEDURE,"Mix the onion, fennel, cumin, mustard and fenugreek seeds, red chilly powder, turmeric powder and salt together in a bowl.\n"+"Take out about 3 tsp in another small bowl and mix with the lime juice.\n"+"Wash, pat dry and slit the green chillies and remove the seeds.\n"+"Fill the chillies with the spice and lime juice mix and keep aside.\n"+"Heat oil in a pan.\n"+"Add the remaining spice mix.\n"+"Allow to splutter and then add the onions and fry till golden.\n"+"Add the chicken and fry till sealed.\n"+"Add the ginger and garlic pastes and fry for a minute.\n"+"Whisk the yoghurt to make it smooth and add it to the chicken. Stir well.\n"+"Add salt to taste, stir well.\n"+"Put the stuffed green chillies on top of the chicken and cover the dish.\n"+
                "Cook till the chicken is done.\n"+":- Serve with hot chappathis, parathas or naan.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American Green Chicken");
        cv.put(DESCRIPTION,"An excellent chicken curry with no masalas..");
        cv.put(INGREDIENTS,"Chicken legs - 2 full\n"+"Onion - 2 nos\n"+"Spring onions - 2 bundle\n"+"Oil - 4 tbsp\n"+"Black pepper powder(coarse) - 1 tbsp\n"+"Mint powder - 1 tbsp\n"+"(if available )\n"+"Salt - As reqd\n"+"Ginger -garlic paste - 2 tbsp\n"+"Greenchillies - 2 nos\n"+"Corianderleaves - A small bundle would do\n"+"Mintleaves - 10 - 15 nos would do\n"+"Whole black pepper - A few\n"+"Cloves (Grambu) - A few");
        cv.put(PROCEDURE,"Cut onions and spring onions into small pieces and chop each chicken leg into 3.\n"+"Add oil in a small pan and add some whole black pepper and cloves to it.\n"+"Keep the flame to medium. Add the chopped onions and stir for a minute.\n"+"Add the spring onions and stir for a minute.\n"+"Add the chicken.\n"+"Keep at mid flame (4 on a electric hob) for atleast 20 mins stirring occasionally.\n"+"Once the chicken is half cooked, add the ginger, garlic, green chillies, salt, mint powder and pepper powder.\n"+"Keep on the flame until chicken is cooked completely (10 - 15 mins), stirring occasionally.\n"+"Add coriander and mint leaves at the end and mix well before serving.\n"+
                ":- If you use a pressure cooker, reduce cooking times to about half. If you use a non-stick pan you will need to stir only occasionally.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Badami Chicken");
        cv.put(DESCRIPTION,"Chicken with the richness of almonds or badam..");
        cv.put(INGREDIENTS,"Whole chicken - 1 no\n"+"(cut into small pieces)\n"+"Yoghurt/Curd(Thayiru) - 1 cup\n"+"Onions(chopped)\n"+"Ginger - 1\" piece\n"+"Garlic pods - 10 nos\n"+"Cloves (Grambu) - 6 nos\n"+"Cinnamom(Karugapatta) - 2\" piece\n"+"Almonds(Badam) - 10 nos\n"+"Cardamom (Elakka) - 4 nos\n"+"Cashewnuts - 10 nos\n"+"Coconut milk - 1 cup\n"+"Oil - 1/2 cup\n"+"Turmericpowder - 1 tsp\n"+"Salt - As reqd\n"+"Chillypowder - As reqd\n"+"Coriander leaves for garnishing");
        cv.put(PROCEDURE,"Make a paste of ginger, garlic, cloves, cinnamon, cardamoms, cashews and almonds.\n"+"Heat oil in a big vessel.\n"+"Add the chopped onions and fry until they turn golden.\n"+"Add the ground masala and fry well.\n"+"While frying this paste, add 3-4 tbsp of water(You will notice that oil floats on top).\n"+"Add yoghurt and the chicken.\n"+"Add salt, turmeric, and chilly powder. Cook for 10 minutes.\n"+"Add coconut milk and cook till done.\n"+"Garnish with coriander leaves.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beer Bottom Chicken");
        cv.put(DESCRIPTION,"Roasted super moist whole chicken with a thin, crispy crust..");
        cv.put(INGREDIENTS,"Whole chicken - 4 - 5 lbs\n"+"For Steaming:-\n"+"Beer - 6 oz\n"+"Garlic pod(large) - 1 no\n"+"Liquid smoke - 1 tsp\n"+"Onion (finely minced) - 2 tsp\n"+"For Basting Spray:-\n"+"Apple cider - 1 cup\n"+"Olive oil - 2 tbsp\n"+"Balsamic Vinegar - 2 tbsp\n"+"Beer - 6 oz\n"+"For Dry Rub:-\n"+"Brownsugar - 1 tsp\n"+"Garlic powder - 1 tsp\n"+"Onion powder - 1 tsp\n"+"Dried oregano - 1 tsp\n"+"Cayenne pepper - 1 tsp or as reqd\n"+"Kosher salt - 1 tbsp\n"+"Dried mustard - 1 tsp");
        cv.put(PROCEDURE,"Wash and pat dry whole chicken.\n"+"Mix together the dry rub ingredients.\n"+"Apply the above dry rub mixture to the inside and outside of the bird.\n"+"Allow to sit up to an hour in the refrigerator.\n"+"Divide beer in half, pouring 6 oz. in a spray bottle and leaving the remaining 6 oz. in the beer can.\n"+"Mix the beer with basting ingredients. Set aside.\n"+"Mix together the ingredients for steaming and place inside the beer can.\n"+"Place bird on top of beer can and place on grill using legs as a pedestal, using the indirect heat method*.\n"+"Allow to cook for 1 1/4 - 2 hrs.\n"+"While cooking, baste the chicken using basting spray several times throughout the process.\n" +
                ":- When the thigh reaches 180 degrees and the skin is crispy and brown and the juices run clear, it is fully cooked.\n"+"Carefully place the bird on a heat proof surface and allow to rest for about 10 mins.\n"+"Carefully remove the beer can by holding the bird with tongs and using an oven mitt, as the can and contents are extremely hot.\n"+"\n"+"*The indirect cooking method:-\n"+"For Charcoal Grills:-\n"+":- Place coals on one side of barbecue grill, cook chicken over the other side, placing a disposable aluminum pan under the bird to catch drained fat. Add 6-8 coals every 30 mins.\n"+"For Multiple Burner Gas Grills:-\n"+":- Turn gas to medium on one burner, place chicken over an unheated burner.\n" +
                "For oven use:-\n"+":- Place in a disposable pie pan and add 1/4 cup of water to the bottom. Cook at 350ª.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Black Pepper Chicken");
        cv.put(DESCRIPTION,"Chinese style black pepper chicken..");
        cv.put(INGREDIENTS,"Chicken (Boneless) - 1/2 kg\n"+"Capsicum - 1 no\n"+"Onion - 1 no\n"+"Garlic pods - 3 nos\n"+"Ginger - 1 small piece\n"+"Black pepper - 1 tbsp\n"+"Soya sauce - 2 tbsp\n"+"Vinegar - 1 tbsp\n"+"Salt - As reqd\n"+"Oil - 2 tbsp\n"+"Springonion - A bunch\n"+"(chopped)\n"+"For marination\n"+"Black pepper - 1 tbsp\n"+"Oyster Sauce - 1 tbsp");
        cv.put(PROCEDURE,"Marinate chicken pieces ( smaller pieces) in black pepper and oyster sauce for 1 hour.\n"+"Cut the capsicum, onion, ginger and garlic into fine slices.\n"+"Fry the onion and when half cooked, add in capsicum, garlic and ginger.\n"+"When the onion becomes golden brown, add the marinated chicken.\n"+"Add black pepper and salt (less than the normal taste, since you would add soya sauce later).\n"+"Cover and cook for 15 mins.\n"+"Add soya sauce and vinegar and again cook for another 10 mins.\n"+"Garnish with chopped spring onions.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beans-Egg Poriya");
        cv.put(DESCRIPTION,"A simple side dish with beans and eggs..");
        cv.put(INGREDIENTS,"Beans - 1/2 kg\n"+"Onions - 2 nos\n"+"Curryleaves - A sprig\n"+"Greenchillies - 2 nos\n"+"(finely minced)\n"+"Salt - As reqd\n"+"Turmericpowder - 1/2 tsp\n"+"Chillypowder - 3/4 tsp\n"+"Cumin(Jeerakam) powder - 1/4 tsp\n"+"Corianderpowder - 1/2 tsp\n"+"Ginger (grated) - 1/2 tsp\n"+"Garlic pods - 2 nos\n"+"Eggs - 4 nos or as reqd\n"+"Oil - As reqd");
        cv.put(PROCEDURE,"Cut beans into small pieces like for poriyal.\n"+"Steam and keep aside.\n"+"Fry onion and green chillies, till the onions turn brown.\n"+"Lower the flame and add curry leaves, salt, turmeric powder, chilly powder, cumin powder, coriander powder, ginger, garlic and fry for 3 -4 mins.\n"+"Add the beans and fry for a further 3 - 5 mins.\n"+"Add eggs and scramble fry till done.\n"+"Remove from fire.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Broccoli Fry");
        cv.put(DESCRIPTION,"Delicious Broccoli fried with eggs..");
        cv.put(INGREDIENTS,"Broccoli(big) - 1 no\n"+"Onion - 1 no\n"+"Greenchillies - 2 - 3 nos\n"+"Tomato - 1/2 of one\n"+"Eggs - 2 nos\n"+"Mustardseeds\n"+"Butter or Oil\n"+"Pepperpowder - 1/2 tsp\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"Cut the broccoli into small pieces but not too small.\n"+"Cook it in a pressure cooker with some salt water waiting for one whistle alone.\n"+"Cut the onion, chillies and tomato.\n"+"Take the cooker and drain the water and keep it aside.\n"+":- Note carefully that the broccoli is not over cooked.\n"+"Heat oil or butter in a pan.\n"+"Splutter mustard seeds.\n"+"Add onion and chillies with the tomato pieces.\n"+"Add the broccoli slowly along with some pepper powder and saute it.\n"+"Beat the eggs well and add to the broccoli and fry them together as the egg takes to the form of a scramble.\n"+"Add salt to the taste and fry for sometime until the eggs get completely ccoked.\n"+
                ":- When u fry, stir the mixture very slowly making sure that the broccoli dont break into tiny pieces.\n"+":- Adding butter instead of oil gives a different taste.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cauliflower Fry");
        cv.put(DESCRIPTION,"Easy cauliflower fry");
        cv.put(INGREDIENTS,"Cauliflower (large) - 1 no\n"+"Eggs - 2 nos\n"+"Breadcrumbs\n"+"Oil - 2 cup\n"+"Salt - As reqd\n"+"Water");
        cv.put(PROCEDURE,"Cut the cauliflower into small florets.\n"+"Wash and boil in salted water just enough to submerge the cauliflower.\n"+"Boil for 8 mins or until cauliflower starts loosing the raw look.\n"+":- Do not overcook, even if its undercooked, it will be ok.\n"+":- Skip the entire step if cauli is American, somehow it cooks faster and is better raw.\n"+"Beat the two eggs well and add a pinch of salt and set aside.\n"+"Dip the cauli florets in eggs and coat it well in bread crumbs.\n"+"Heat the oil well in a pan or a kadai.\n"+"Deep fry them.\n"+":- Serve hot with ketchup (optional).\n"+":- If you want to eat the whole thing by yourself, I understand, nobody is going to pass judgements about you.\n" +
                ":- If you run out of eggs, add more and if there is any left over, it makes the best scrambled egg.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cheese Omlette");
        cv.put(DESCRIPTION,"Wholesome breakfast for the family..");
        cv.put(INGREDIENTS,"Milk - 1 cup\n"+"Breadcrumbs - 1 cup\n"+"Cheese(grated) - 100 gm\n"+"Eggs - 6 nos\n"+"Salt - As reqd\n"+"Pepper - As reqd\n"+"Butter - 1 tbsp\n");
        cv.put(PROCEDURE,"Heat oven to 250 degree.\n"+"Boil milk and add bread crumbs. Keep it aside to cool.\n"+"Lightly beat eggs with salt and pepper.\n"+"Mix well together the grated cheese, beaten eggs and the soaked bread crumbs.\n"+"Heat a cast iron skillet in the oven.\n"+"Add butter and when it melts, add the egg mix.\n"+"Bake it for about 15 mins, till the egg is set.\n"+":- Serve warm.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chilly Garlic Egg");
        cv.put(DESCRIPTION,"A different egg recipe..");
        cv.put(INGREDIENTS,"Eggs - 6 nos\n"+"Onion - 3 nos\n"+"Garlic pods - 14 nos\n"+"Redchillies - 6 nos\n"+"Turmericpowder - 1/2 tsp\n"+"Salt - As reqd\n"+"Curryleaves (chopped)\n"+"Oil to fry");
        cv.put(PROCEDURE,"In a bowl, beat the eggs with salt and turmeric powder.\n"+"Bake them in the Idli cooker for 6 - 8 mins.\n"+"After its done, cut them into small pieces.\n"+"Grind together the red chillies & garlic.\n"+"Heat oil in a pan.\n"+"Add the garlic-chilly paste and saute for 2 mins.\n"+"Add chopped onions, curry leaves and beaten eggs.\n"+"Garnish with mint leaves or coriander.\n"+":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chinese Egg Thoran");
        cv.put(DESCRIPTION,"Egg Thoran..");
        cv.put(INGREDIENTS,"Egg - 1 no\n"+"Greenchillies - 2 nos\n"+"(finely chopped)\n"+"Onion - 1 no\n"+"(cut into small pieces)\n"+"Chilly sauce - 1/2 tsp\n"+"Soya sauce - 1/2 tsp\n"+"Tomato sauce - 1 tsp\n"+"Pepper - A pinch\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"Heat oil in a pan.\n"+"Fry chopped onions, till they turn golden brown.\n"+"Add green chillies, chilly sauce, soya sauce, tomato sauce and fry for some more time.\n"+"Add egg and mix them well with pepper and salt.\n"+":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chowlet");
        cv.put(DESCRIPTION,"An omlet with chowmin in it..");
        cv.put(INGREDIENTS,"Egg - 1 no\n"+"Noodles(any type)\n"+"Tomato\n"+"Corianderleaves\n"+"Onion\n"+"Greenchillies\n"+"Salt - As reqd\n"+"Oil - any ");
        cv.put(PROCEDURE,"Boil the noodles first and keep aside.\n"+"Chop tomato, onion, coriander leaves and green chillies.\n"+"Beat the egg and add the vegetables and salt.\n"+"Add the noodles and again beat well.\n"+"Fry in the frying pan like omlet.\n"+":- Serve with ketchup or chutney.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Egg & Tomato Rice");
        cv.put(DESCRIPTION,"Easy to prepare egg and tomato rice..");
        cv.put(INGREDIENTS,"Cooked rice - 1 1/2 cups\n"+"Eggs - 2 nos\n"+"Tomato - 1 no\n"+"(chopped)\n"+"Onion - 1 no\n"+"(chopped)\n"+"Capsicum - 1 no\n"+"(chopped)\n"+"Garlic pods - 2 - 3 nos\n"+"(crushed)\n"+"Pepperpowder - 1 tsp\n"+"Soya sauce - 1 tbsp\n"+"Ajinomotto - A pinch\n"+"Salt - As reqd\n"+"Oil - As reqd");
        cv.put(PROCEDURE,"Beat the eggs and keep aside.\n"+"Heat oil in a frying pan.\n"+"Add the onions and garlic and saute well.\n"+"Add the eggs and scramble well.\n"+"Add the chopped tomatoes and capsicum and saute for a while.\n"+"Add the cooked rice and mix well.\n"+"Add pepper powder, soya sauce, ajinomotto and salt and switch off the stove.\n"+":- Serve hot with tomato ketchup.\n"+":- Kids will love it.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Andhra Simple Chicken Biriyani");
        cv.put(DESCRIPTION,"Chicken Biriyani..");
        cv.put(INGREDIENTS,"Chicken - 1 no\n"+"(cut into large pieces)\n"+"Basmati rice - 3 cups\n"+"Onions - 5 nos\n"+"Ginger -garlic paste - 1 tbsp\n"+"Mintleaves (Pudhina) - 1 bunch\n"+"Corianderleaves - 1 bunch\n"+"Curd - 2 cups\n"+"Turmericpowder - 1 tsp\n"+"Corianderpowder - 3 tsp\n"+"Cumin(Jeerakam) powder - 1 tsp\n"+"Kashmiri red chilli powder - 2 tsp\n"+"Greenchillies - 4 - 5 nos\n"+"Cinnamon(Karugapatta) sticks - 2 nos\n"+"Cloves (Grambu) - 10 nos\n"+"Cardamoms(Elakka) - 6 nos\n"+"Garam masala powder - 1/2 tsp\n"+"Salt - As reqd\n"+"Oil for deep frying\n"+"Ghee - 1/2 a cup\n"+"Lime juice\n"+"Saffron - A few (optional)\n"+"Eggs - 4 nos\n"+"Milk - 4 tbsp (optional)\n" +
                "Cashewnuts - 20 nos\n"+"Raisins (Kismis) - 20 nos");
        cv.put(PROCEDURE,"Marinate the chicken with beaten curd, ginger-garlic paste, turmeric, coriander, jeera and chilli powders and salt for about an hour.\n"+"Clean and wash the rice, drain and keep aside.\n"+"Clean and chop the mint and coriander leaves.\n"+"Slice onions into very thin pieces and deep fry them in oil mixed with 1/4 cup of ghee till crisp.\n"+"In the same oil, fry chopped cashew nuts and raisins till golden brown, drain and keep aside.\n"+"Slit green chillies and mix into the marinated chicken. Put chicken and marinate into the kadai in which the onions/cashew nuts were fried.\n"+"Add a little water, cover and cook till the chicken is half done.\n" +
                "Remove the chicken pieces with a slotted spoon and measure the stock. Add enough water to make it six cups.\n"+"Put the rice into a rice cooker, add the whole spices, arrange the chicken pieces on top, sprinkle three-quarters of the fried onions and all the chopped coriander and mint leaves.\n"+"Pour in the measured stock into which the garam masala powder has been added.\n"+"Pour the remaining quarter cup of ghee over the whole mixture. Close and cook till done.\n"+"Meanwhile, hard-boil and shell the eggs.\n"+"Soak the saffron in milk, if you are using it.\n"+"When the biryani is done, open the rice cooker, and sprinkle saffron-soaked milk on top. Mix carefully and cover and leave for a while.\n" +
                "Just before serving, mix in the juice of half a lime. Arrange on a serving dish and garnish with the remaining fried onions, cashew nuts, raisins, and boiled eggs.\n"+":-Serve piping hot with papads, raita and pickles.\nMarinate the chicken with beaten curd, ginger-garlic paste, turmeric, coriander, jeera and chilli powders and salt for about an hour.\n"+"Clean and wash the rice, drain and keep aside.\n"+"Clean and chop the mint and coriander leaves.\n"+"Slice onions into very thin pieces and deep fry them in oil mixed with 1/4 cup of ghee till crisp.\n"+"In the same oil, fry chopped cashew nuts and raisins till golden brown, drain and keep aside.\n"+"Slit green chillies and mix into the marinated chicken. Put chicken and marinate into the kadai in which the onions/cashew nuts were fried.\n" +
                "Add a little water, cover and cook till the chicken is half done.\n"+"Remove the chicken pieces with a slotted spoon and measure the stock. Add enough water to make it six cups.\n"+"Put the rice into a rice cooker, add the whole spices, arrange the chicken pieces on top, sprinkle three-quarters of the fried onions and all the chopped coriander and mint leaves.\n"+"Pour in the measured stock into which the garam masala powder has been added.\n"+"Pour the remaining quarter cup of ghee over the whole mixture. Close and cook till done.\n"+"Meanwhile, hard-boil and shell the eggs.\n"+"Soak the saffron in milk, if you are using it.\n"+"When the biryani is done, open the rice cooker, and sprinkle saffron-soaked milk on top. Mix carefully and cover and leave for a while.\n" +
                "Just before serving, mix in the juice of half a lime. Arrange on a serving dish and garnish with the remaining fried onions, cashew nuts, raisins, and boiled eggs.\n"+":-Serve piping hot with papads, raita and pickles.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mutton Biryani");
        cv.put(DESCRIPTION,"Try this only if you the patience for authentic Hydrabadi biryani..");
        cv.put(INGREDIENTS,"Mutton - 1 kg\n"+"Onion - 1/2 kg\n"+"Corianderpowder - 2 tsp\n"+"Turmericpowder - 1 tsp\n"+"Red chilli powder - 2 tsp\n"+"Ground cardamom powder - 2 tsp\n"+"Whole spices (Cardamom\n"+"Cloves\n"+"Cinnamon and Fennel seeds) - 50 gm\n"+"Ajinomoto - 1 pinch\n"+"Saffron - A few strands\n"+"Curds - 1 1/2 cups\n"+"Salt - As reqd\n"+"Corianderleaves - A bunch\n"+"Pudhina leaves - A bunch\n"+"Basmati Rice - 2 kgs\n"+"Milk - 1 cup\n"+"Ghee - 1/2 kg\n"+"Hot oil - 5 tsp");
        cv.put(PROCEDURE,"Clean the mutton and marinate it with salt and tumeric. Keep it for 5 mins.\n"+"Add the chilli powder, coriander powder and ginger-garlic paste and leave it for 5 mins.\n"+"Add the whole garam masalas.\n"+"Add the saffron.\n"+"Add the curds.\n"+"Deep fry the sliced onions.\n"+"Add them to the marination after crushing them.\n"+"Add ghee to it.\n"+"Add the ground elachi powder.\n"+":- Keep in mind not to mix the ingredients. Let it stay.\n"+"Add hot oil.\n"+"Take a vessel with water for cooking the rice.\n"+"Once it is boiling hot, add the whole spices and let the water be filled with the flavour of the spices.\n"+"Add the rice and keep stirring for 5 mins.\n"+"Now comes the imp part - Take a seive and ensure that the water is completely off the rice and now spread this rice over the marinated mutton.\n" +
                "Sprinkle the coriander and pudina on the top followed by the milk.\n"+":- You can top it with orange food colour also.\n"+"Keep the vessel on fire on dum for 1/2 hr without disturbing it.\n"+":- Open it and enjoy mouth watering and awesome biryani, hyderabadi style.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Egg Biryani");
        cv.put(DESCRIPTION,"This kerala egg biryani is very different from the regular egg biryani which was cooked and put in dhum as layered..");
        cv.put(INGREDIENTS,"Eggs - 2 nos\n"+"(boiled)\n"+"Cinnamon(Karugapatta) - 2 sticks\n"+"Cloves (Grambu) - 2 nos\n"+"Ginger garlic paste : 2 tsp\n"+"Cardamom (Elakka) - 2 nos\n"+"Onion (big) - 3 nos\n"+"(thinly sliced)\n"+"Tomato - 1 no\n"+"Basmati rice - 1 cup\n"+"Water - 2 cups\n"+"Chillypowder - 2 tsp\n"+"Corianderpowder - 1 tsp\n"+"Salt - As reqd\n"+"Oil - 2 - 3 tbsp\n"+"Cashewnuts for garnishing");
        cv.put(PROCEDURE,"Heat oil in a pressure cooker.\n"+"Add cinnamon, cardamom and cloves and fry for 2 mins.\n"+"Add onion and saute for 7 - 10 mins.\n"+"Add tomato and saute for 3 mins.\n"+"Add rice and stir for 3 mins.\n"+"Add boiled eggs, chilly powder, coriander powder, water and salt.\n"+"Cover and cook for about 3 - 4 mins.\n"+"Garnish Kerala Egg Biryani with cashew nuts.\n"+":- Serve Kerala Egg Biryani with raita.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chicken Fried Rice");
        cv.put(DESCRIPTION,"Cooked basmati rice/jasmine rice mixed with shredded chicken, red pepper, fish sauce and other ingredients..");
        cv.put(INGREDIENTS,"Basmati/Jasmine rice - 2 cups(cooked and refrigerated for 4 hours)\n"+"Cooked chicken shreds - 1/2 cup\n"+"Garlic (minced) - 2 cloves\n"+"Red pepper - 1 no(chopped)\n"+"Green chilly(minced) - 1 no\n"+"Chicken stock - 2 tbsp\n"+"Fish sauce - 1 tbsp\n"+"Frozen peas - 1/4 cup\n"+"Spring onions - 1 no(finely sliced)\n"+"Egg - 1 no\n"+"Fresh basil or coriander leaves - 1/4 cup(chopped)\n"+"Vegetable oil - 1 1/2 tbsp");
        cv.put(PROCEDURE,"For preparing thai chicken fried rice, first drizzle the refrigerated cold rice with\n"+"1/2 tbsp oil.\n"+"Using your fingers, mix the cooked basmati/jasmine rice with oil and remove any clumps present. Keep this aside.\n"+"Heat remaining oil in a frying pan and saute garlic, red pepper and green chilly. Stir fry in low heat until fragrant.\n"+"Add shredded chicken and 1 tbsp chicken stock. Stir fry for a few minutes.\n"+"Add remaining 1 tbsp chicken stock and prevent pan from becoming dry.\n"+"Using a wooden spatula push the ingredients aside and crack the egg into the oil in the middle of the pan.\n"+"Stir quickly to cook the egg and prepare scrambled egg.\n"+"Stir in cooked rice and fish sauce. Stir fry in medium heat for a few minutes.\n"+"Add frozen peas and stir fry for 5 more minutes in low heat until you hear rice `popping`.\n"+
                "Check for salt and if lacking, add some more fish sauce. Add little oil to the base of pan and stir gently to avoid stickiness of rice.\n"+"Sprinkle spring onion and fresh basil or coriander leaves.\n"+"Thai chicken fried rice is ready and serve hot with chilly sauce on the side.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chinese Fried Rice");
        cv.put(DESCRIPTION,"Delicious Fried rice - Chinese Cuisine..");
        cv.put(INGREDIENTS,"Basmati rice - 2 cups\n"+"Chopped carrot - 1 cup\n"+"Chopped beans - 1 cup\n"+"Greenpeas - 1/2 cup\n"+"Chopped spring onion - 1/2 cup\n"+"Soya sauce - 4 tbsp\n"+"Pepperpowder - 2 tsp\n"+"Ajinomoto - 1/2 tsp(Optional)\n"+"Salt - As rqrd\n"+"Oil - 1 tbsp\n"+"Garlic - 1 tsp\n"+"(chopped)\n");
        cv.put(PROCEDURE,"Wash and cook basmati rice till it is 80% done. Drain the rice and keep it aside.\n"+"Steam cook chopped carrot and beans.\n"+"Heat 1 tablespoon oil in a large chinese kadai and add chopped garlic.\n"+"When garlic becomes golden brown, add cooked carrot and beans and saute for a while.\n"+"Add cooked rice along with soya sauce, pepper powder, salt and ajinomoto.\n"+"Mix it well and keep it in a low flame for 20 minutes.\n"+"Add chopped spring onion and mix it again and remove from fire.\n"+":- If you want to make this a non veg fried rice, you can add scrambled egg(or you can add beaten egg to the cooked vegetables and scramble it) or cooked mince chicken / prawns (cook chicken/prawns by adding little salt, pepper powder and garam masala) or any other non veg according to your taste and creativity.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Fish Biriyani");
        cv.put(DESCRIPTION,"Spicy Fish Biryani Easy Recipe..");
        cv.put(INGREDIENTS,"King Fish – 8 - 10 pcs\n"+"(cut into small )\n"+"Basmati rice – 2 - 3 glass\n"+"Onion - 6 - 7 pcs\n"+"Tomato - 2 - 3 pcs\n"+"Lemon - 1 pc\n"+"Greenchillies - 10 nos\n"+"(cut into small pcs)\n"+"Garlic - 5 tsp\n"+"(cut into small pcs)\n"+"Ginger - 10 tsp\n"+"(cut into small pcs)\n"+"Whole garam masala\n"+"Corianderleaves\n"+"Raisins\n"+"Cashew nut\n"+"Salt - As reqd\n"+"Oil/Ghee\n"+"For marination:-\n"+"Red chilly powder – 2 - 3 tsp\n"+"Turmericpowder - 1 tsp\n"+"Black pepper - 2 tsp\n"+"Salt - As reqd\n"+"Vinegar");
        cv.put(PROCEDURE,"Marinate fish with red chilly powder, turmeric powder, black pepper, salt ad vinegar for 2 - 3 hrs.\n"+"Half fry them and keep aside.\n"+"Fry green chillies, garlic and ginger and make it into a dry paste.\n"+":- Do not add water.\n"+"Heat oil/ghee in the kadai.\n"+"Add whole garam masala (full cinnamon, cardamom, clove etc as per your taste for spice).\n"+"Add thinly chopped onions and fry it till brown.\n"+"Add the above dry paste into it.\n"+"Add garam masala powder/biryani masala to it. (optional)\n"+"Add tomato paste to the onions & heat it for 5 - 10 mins.\n"+"Add 2 - 3 drops of lemon in the gravy.\n"+"Add the fried fish to it & slowly mix the gravy in such a way that fish should be covered under gravy.\n"+"Wash rice & keep aside for an hr.\n"+"Add salt in it & then cook it.\n"+
                ":- You can add 2 - 3 drops of lemon into it (optional).\n"+"Make layers of fish gravy & rice.\n"+"Garnish Fish Biryani with coriander leaves, raisins & cashew nuts.\n"+"Close the fish biryani with a lid and put it on dum for 15 mts. Keep the fish biryani on light fire for 15 mts.\n"+":- Fish Biryani is ready.\n"+":- Serve Fish Biryani with raita and papad.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mutton Biriyani");
        cv.put(DESCRIPTION,"Simple Mutton Biriyani..");
        cv.put(INGREDIENTS,"mutton 1 kg\n"+"biriyani rice 5 cups\n"+"green chilli 15\n"+"ginger garlic paste 1 cup\n"+"turmeric 1 sp\n"+"spices: cinnamon 4\n"+"cloves 15\n"+"cardamom 15\n"+"star annise 1\n"+"bay leaf 3\n"+"mint leaf 1/2 cup\n"+"onion 1 cup\n"+"tomato 6-7\n"+"salt to taste");
        cv.put(PROCEDURE,"cook meat with ginger garlic paste , 2 chilli, salt 1/2 sp, turmeric\n"+"soak rice for 1/2 an hour\n"+"add spices\n"+"add green chilli and mint leafs\n"+"add onion and ginger garlic paste\n"+"add tomato and salt\n"+"now add the cooked meat\n"+"add water 10 cups\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Dum Biriyani");
        cv.put(DESCRIPTION,"Dum Biriyani..");
        cv.put(INGREDIENTS,"Rice - 2cup\n"+"Mushroom - 2 cup\n"+"Onions - 2\n"+"Tomato - 2\n"+"Curd - 1 cup\n"+"Ginger garlic paste - 2 tblsp\n"+"Mint and coriander - 1/2 cup\n"+"Red chili powder - 1 tsp\n"+"Coriander - 1 tsp\n"+"Garammasala - 1 tsp\n"+"Salt as taste\n"+"Oil and ghee - 5 tblsp\n"+"Whole spice - 1 tblsp");
        cv.put(PROCEDURE,"take whole spice and tie and small cloth\n"+"Soak rice and boil 50 percent and keep aside\n"+"deep fry onions and keep aside\n"+"In bowl add chopped mushroom and tomatoes, ginger garlic paste and also leaves and all powder and curd\n"+"Mix well and marinate for 10 ,mins\n"+"In heavy bottom pan add oil ghee some and pour mushroom masala and layer 1st portion rice\n"+"Now topping fried onions and mint and coriander and garam masala\n"+"likewise do going rice portion and if want add saffron and garam masala cook high flame in 5 mins and keep tawa in bottom remaining 15 mins in low falme\n"+"Now its ready to serve mushroom dum biriyani\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aavoli");
        cv.put(DESCRIPTION,"Tasty Fish Recipe.....");
        cv.put(INGREDIENTS,"Pomfret fish (Aavoli) - 2 nos\n"+"Ginger garlic paste - 2 tsp\n"+"Chillypowder - 1 tbsp\n"+"Turmericpowder - 1/4 tsp\n"+"Curryleaves - A few\n"+"Garammasala - A pinch\n"+"Green chilly - 2 nos\n"+"(Make it into a paste)\n"+"Salt - As reqd\n"+"Oil - As reqd\n");
        cv.put(PROCEDURE," Marinate the fish with ginger garlic paste, green chilly paste, chilly powder, turmeric powder, salt and curry leaves along with 2 tbsp of water.\n"+"Heat oil in a kadai.\n"+"Fry the marinated fish till done.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Alluring Fish Fry");
        cv.put(DESCRIPTION,"Fish fry - That is the best..");
        cv.put(INGREDIENTS,"Maida - 1 cup\n"+"Cornflour - 1 cup\n"+"Bakingpowder - 3 spoons\n"+"Milk - 2 cups\n"+"Yeast (baker`s) - 2 gm\n"+"Egg - 1 no\n"+"Lemon juice - 2 tbsp\n"+"Salt - As reqd\n"+"Oil - 250 ml\n"+"Fish pieces - 1 kg\n"+"Red chilly powder - 3 tbsp\n"+"Turmericpowder - 1 tsp\n"+"Refined oil - 350 ml");
        cv.put(PROCEDURE,"Mix maida, corn flour and baking powder, add one cup of milk and mix well.\n"+"To about a cup of milk, add yeast. Keep aside for an hour.\n"+"After one hour add egg white and beat well.\n"+"Add both 1 & 2 to each other beat thoroughly and prepare a thick batter.\n"+"To the fish pieces, add lemon juice, red chilly powder, salt, turmeric powder and marinate.\n"+"Add the marinated fish pieces to the batter.\n"+"Heat oil in a frying pan.\n"+"Deep fry the fish pieces one by one until brown.\n"+":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Shrimp Curry");
        cv.put(DESCRIPTION,"Cucumber with other ingredients..");
        cv.put(INGREDIENTS,"Cooking cucumber - 800g(peeled\n"+"de-seeded and cubed)\n"+"Redchillies - 50g(slit)\n"+"Cloves (Grambu) - 6 nos\n"+"Garlic - 2 cloves\n"+"Lemon grass sticks - 3 nos(cut the root)\n"+"Shrimp paste - 1 tsp\n"+"Turmericpowder - 1/2 tsp\n"+"Onion - 1 no(finely cubed)\n"+"For the dish:\n"+"Lime leaves - 1 no\n"+"Garlic - 30g(chopped)\n"+"Fish stock - 3 tsp\n"+"Coconut milk - 150ml\n"+"Corianderleaves - 1 spring(chopped)\n"+"Oil - As reqd\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"For preparing shrimp paste cucumber curry, grind red chillies, lemon grass, garlic, turmeric powder, shrimp paste and cloves. Keep this curry paste aside.\n"+"Cook the cucumber in water and salt until done. Drain it and keep it aside.\n"+"Heat oil in a vessel. SautT the chopped garlic, salt and onion.\n"+"Add in the curry paste and allow it to cook for 2 minutes on low flame.\n"+"Pour in the coconut milk and fish stock. Allow it to boil.\n"+"Then add in the cooked cucumber and lime leaf. Allow it to cook for another 5 minutes.\n"+"Garnish with coriander leaves.\n"+"Shrimp paste cucumber curry is ready. Serve hot with cooked basmati rice.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Prawn Chilly");
        cv.put(DESCRIPTION,"Prawns with other ingredients..");
        cv.put(INGREDIENTS,"Prawns - 1/2 kg(de -veined and cleaned)\n"+"Garlic - 20 cloves(finely chopped)\n"+"Dry chilly flakes - 3 tbsp\n"+"Pepperpowder - 1/2 tsp\n"+"Corianderleaves - 1/2 cup(finely chopped)\n"+"Curryleaves - 2 springs\n"+"Butter - 500g\n"+"Olive oil - 1 1/2 cups\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"For preparing garlic chilly prawns, heat olive oil and butter in a big frying pan.\n"+"Toss in the chopped garlic, chilly flakes, salt and prawns to the frying pan.\n"+"Sprinkle coriander leaves and curry leaves over it.\n"+"Cook the prawns on both the sides.\n"+"Remove it from the heat and gently pour the entire contents into a bowl.\n"+"Sprinkle pepper powder.\n"+"Garlic chilly prawns is ready. Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Baked Fish");
        cv.put(DESCRIPTION,"Easy to prepare..");
        cv.put(INGREDIENTS,"Fish fillets - 1/2 kg\n"+"Salt - As reqd\n"+"Pepper - 2 tsp\n"+"Butter - 2 tsp\n"+"Lemon juice - 1 tsp\n"+"Onion - 1 no(chopped)");
        cv.put(PROCEDURE,"Arrange fish fillets in a pan, sprinkle salt and pepper.\n"+"Mix together butter, lemon juice, onion, pour over the fish.\n"+"Bake at 400F for 30 minutes or until done.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Broiled Cat Fish");
        cv.put(DESCRIPTION,"Tasty fish fried in very little oil..");
        cv.put(INGREDIENTS,"Whole cat fish(skin removed) - 1 no\n"+"Black pepper - 1/4 tsp\n"+"Chillypowder - 1/2 tsp\n"+"Salt - As reqd\n"+"Olive oil - 1/4 tsp");
        cv.put(PROCEDURE,"Clean the fish and make 2 - 3 small cuts across the fish on either side by using a knife.\n"+"Marinate it with chilly powder, black pepper powder, salt and olive oil and keep it in the fridge for atleast an hr.\n"+"Take a baking pan and place the fish in it.\n"+"Broil high in the upper rack of your oven for 20 mins.\n"+"Turn side and broil for another 20 mins.\n"+":- Serve with rice or it can be eaten as it is.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Prawns Capsicum");
        cv.put(DESCRIPTION,"Good starter..");
        cv.put(INGREDIENTS,"Prawns - 150g\n"+"Onion - 1 no(chopped)\n"+"Capsicum - 2 nos(cut into 4 pieces)\n"+"Tomato - 2 nos(chopped)\n"+"Mayonnaise - 1 cup\n"+"Pepper - As reqd\n"+"Salt - As reqd\n"+"Butter - 1 tbsp\n"+"Parsley - Few");
        cv.put(PROCEDURE,"For preparing capsicum prawns canapes, heat butter in pan.\n"+"Add prawns, parsley, salt and pepper.\n"+"Fry and cook the prawns.\n"+"When done, remove and keep it in a bowl.\n"+"Fry capsicum and place it in a plate.\n"+"Mix onion, tomato and mayonnaise in a bowl.\n"+"On top of capsicum place the mayo mix and top it with prawns.\n"+"Capsicum prawns canapes is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chemeen Theeyal");
        cv.put(DESCRIPTION,"PrawnShrmp curry in coconut ..");
        cv.put(INGREDIENTS,"Prawns (Chemeen) - 1/2 kg\n"+"Onion (cut long) - 200 gm\n"+"Greenchillies (cut long) - 6 nos\n"+"Coconut (shredded finely) - 1 no\n"+"Fenugreekseeds (Uluva) - 1/2 tsp\n"+"Corianderpowder - 2 tsp\n"+"Red chilly(Kollamulaku) - 6 nos\n"+"Turmericpowder - 1/4 tsp\n"+"Coconutoil - 2 tbsp\n"+"Mustardseeds - 1/2 tsp\n"+"Curryleaves - 2 stems\n"+"Sambhar tamarind(Puli) - As reqd\n"+"Small onions(Kunjulli)\n"+"(cut into small pieces) - 8 nos");
        cv.put(PROCEDURE,"Heat 1 tbsp of oil in a pan.\n"+"Add fenugreek seeds and when it becomes red, add red chillies, coriander powder and coconut.\n"+"Fry till they become brown in colour. Cool for a while.\n"+"Grind without water till oil separates.\n"+"Add 1/4 glass of water and mix to grind well.\n"+"Clean the prawns and add to green chilly, onion cut long, turmeric powder, salt and boil nicely.\n"+"Add tamarind juice.\n"+"When it starts boiling, add the ground paste to the prawns and boil again.\n"+"Add curry leaves.\n"+"Heat coconut oil in another pan.\n"+"Add mustard seeds, fenugreek, and onions cut small and fry for a min and add to the prawn curry.\n"+"Close the pan so as not to lose the flavour.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mutton Fry");
        cv.put(DESCRIPTION,"Dry dish of mutton..");
        cv.put(INGREDIENTS,"Mutton cubes - 1/2 kg(boneless)\n"+"Turmericpowder - 1/2 tsp\n"+"Kashmiri Chilly Powder - 1 tbsp\n"+"CorianderPowder - 2 tbsp\n"+"Garammasala - 1 tsp\n"+"Meat Masala(optional) - 1 tsp\n"+"Ginger -garlic paste - 1 tsp\n"+"Salt - to taste\n"+"Coconutoil - 4 tbsp\n"+"Curryleaves - 4 sprigs");
        cv.put(PROCEDURE,"Clean, wash and drain mutton cubes and keep aside.\n"+"Fry turmeric powder, kashmiri chilly powder and coriander powder together in a pan without oil to remove the raw smell and taste of these powders.\n" +
                "Marinate mutton cubes with the fried masala powder, garam masala, meat masala (optional), ginger-garlic paste and salt.Keep the marinated mutton cubes for half an hour.\n"+"Cook the mutton cubes by adding little hot water till it is done. (Refer Tips)\n"+"Heat coconut oil in a pan and add curry leaves.\n"+"Transfer the cooked mutton into it along with the gravy (if there is any gravy left after cooking the mutton).\n"+"Fry it in a low flame till it reaches a dry consistency and is coated well with the masala. Keep stirring in between.\n"+"Serve hot with steamed rice/kappa/appam/chappathi.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Attirachi Curry");
        cv.put(DESCRIPTION,"Mutton masala cooked in Kerala Style..");
        cv.put(INGREDIENTS,"Mutton - 1 1/2 kg\n"+"Grated coconut - 1 1/2 cups\n"+"Water - 2 cups\n"+"Coconutoil - 6 tbsp\n"+"Corianderseeds - 5 tbsp\n"+"Redchillies (Kollamulaku) - 8 nos\n"+"Garlic pods - 8 nos\n"+"Ginger - 10 gm\n"+"Cardamom (Elakka) - 2 nos\n"+"Cloves (Grambu) - 4 nos\n"+"Peppercorns(Kurumulaku) - 1/2 tsp\n"+"Cinnamon(Karugapatta) - 2 sticks\n"+"Onion (large) - 2 nos\n"+"(chopped)\n"+"Salt - As reqd\n"+"Turmericpowder - 1 tsp\n"+"Ghee - 1 tbsp\n"+"Coconut chips(Thenga kothu) - 1/4 cup\n"+"Curryleaves - 1 sprig");
        cv.put(PROCEDURE,"Extract 1 cup of thick milk from grated coconut using 1 cup of water.\n"+"Add 3/4 cup of water to the same coconut and extract 3/4 cup of thin coconut milk.\n"+"Heat 1 tbsp of oil in a pan.\n"+"Roast together coriander seeds, chillies, garlic, ginger, cloves, cinnamon, cardamom and peppercorns.\n"+"Grind them into a paste adding 1/2 cup of water.\n"+"Heat remaining oil in a pan or a cooker.\n"+"Add onion and fry, till golden brown.\n"+"Add the ground masala and stir for 2 - 3 mins.\n"+"Add the cleaned mutton, salt and turmeric powder and stir fry for 5 mins.\n"+"Add thin coconut milk and stir.\n"+"Close the cooker and bring it to full pressure.\n"+"Reduce the flame and cook for 12 mins.\n"+"Remove the cooker from heat and allow it to cool naturally.\n"+"After opening the lid, add the thick coconut milk.\n"+
                "Cook, till the gravy becomes thick.\n"+"Heat ghee in a pan or a kadai for a minute.\n"+"Add coconut pieces and curry leaves and stir fry, till the coconut turns golden brown.\n"+"Pour it over the curry.\n"+":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Barbecued Lamb Chops");
        cv.put(DESCRIPTION,"Barbecued Lamb Chops..");
        cv.put(INGREDIENTS,"Lamb chops - 2 kg\n"+"Garammasala - 1 ½ tbsp\n"+"Pepper - 2 tsp\n"+"Salt - 3 tsp\n"+"Vinegar - 2 tbsp\n"+"Oil - 2 tbsp\n"+"Bay leaves(Vazhana/Karuga ela) - 2 large\n"+"Oregano - 1 tbsp");
        cv.put(PROCEDURE,"Wash the lamb and cut them into one-inch cubes.\n"+"Combine all the ingredients and marinate chops for 2 to 3 hours.\n"+"Barbecue or grill for about 20 minutes.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Brain Fry");
        cv.put(DESCRIPTION,"Goat`s brain is cooked and fried in oil..");
        cv.put(INGREDIENTS,"Goat`s brain - 1 no(cleaned)\n"+"Chillypowder - 1 1/2 tsp\n"+"Turmericpowder - 1/2 tsp\n"+"Garammasala - 1/4 tsp\n"+"Pepperpowder - 1/2 tsp\n"+"Ginger paste - 1/2 tsp\n"+"Garlic paste - 1/2 tsp\n"+"Egg whites - 2 nos\n"+"Breadcrumbs - As reqd\n"+"Corianderleaves - 1 tbsp(finely chopped)\n"+"Water - As reqd\n"+"Oil - As reqd\n"+"Salt - As reqd");
        cv.put(PROCEDURE,"For preparing tasty brain fry, cook the brain in chilly powder, turmeric powder, garam masala, pepper powder, ginger paste, garlic paste, coriander leaves and salt with required water.\n"+"Slice the brain in 2 inch pieces.\n"+"Dip the slices in egg whites and then cover it in bread crumbs well.\n"+"Fry it in oil.\n"+"Tasty brain fry is ready. Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chilli Mutton Masala");
        cv.put(DESCRIPTION,"A typical Hyderabadi dish..");
        cv.put(INGREDIENTS,"Mutton - 1/2 kg\n"+"Onion (medium) - 1 no\n"+"Turmericpowder - 1/4 tsp\n"+"Ginger -garlic paste - 1 tbsp\n"+"Dry red chillies(Kollamulaku) - 6 nos\n"+"Greenchillies - 2 nos\n"+"Pepper - 1/4 tsp\n"+"Red chilly powder - 1/4 tsp\n"+"Garammasala - 1/2 tsp\n"+"Corianderleaves - 2 tbsp\n"+"Mintleaves (Pudhina) - 2 tbsp\n"+"Dry coconut powder - 2 tbsp\n"+"Almond(Badam) powder - 2 tbsp\n"+"Curd - 1/4 kg\n"+"Oil - 8 tbsp");
        cv.put(PROCEDURE,"Pressure cook mutton with ginger, garlic paste, turmeric powder, salt, sliced onions, oil and 1 cup of water.\n"+"Mix together coconut powder, almond powder, curd, green chillies, coriander leaves, mint leaves and garam masala.\n"+"Grind it to a fine paste.\n"+"When the mutton is tender, add the above paste, dry red chillies, pepper and red chilly powder to the mutton.\n"+"Cook, until the oil leaves the sides of the vessel.\n"+"Add salt, if required.\n"+"Add little water.\n"+"Simmer and cook for 1 min.\n"+":- Serve hot with parathas and rice.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Garlic Mutton");
        cv.put(DESCRIPTION,"Mutton delight..");
        cv.put(INGREDIENTS,"Mutton - 1 kg\n" +"Garlic - 1/2 cup\n" +"Chillypowder - 2 tsp\n" +"Corianderpowder - 2 tsp\n" +"Turmericpowder - 1/4 tsp\n" +"Cuminseeds (Jeerakam) - 1/8 tsp\n" +"Aniseed (Perinjeerakam) - 2 pinch\n" +"Ginger - 1 tsp\n" +"Pepperpowder - 1/2 tsp\n" +"Cloves (Grambu) - 12 nos\n" +"Cinnamon(Karugapatta) - 2\" piece\n" +"Cardamom (Elakka) - 2 nos\n" +"Onion (chopped) - 2 cups\n" +"Tomato (chopped) - 1 cup\n" +"Coconut milk - 1/2 cup\n" +"Sugar - 2 pinch\n" +"Salt - As reqd\n" +"Oil");
        cv.put(PROCEDURE,"Grind together chilly powder, coriander powder, cumin seeds, aniseeds, chopped ginger, cloves, cinnamon and cardamom properly.\n" +"Add salt and mix this paste with mutton and keep aside for 3 hours.\n" +"Heat oil in a pan.\n" +"Add turmeric powder.\n" +"Add 1 cup of chopped onions and fry, until it becomes golden brown in color.\n" +"Remove the onions from oil.\n" +"Add the remaining 1 cup of onion and tomato into the oil and fry it.\n" +"Add sugar.\n" +"Add mutton and stir for sometime.\n" +"Add some hot water and cook well.\n" +"Add coconut milk.\n" +"Remove from the stove.\n" +"Cook the garlic in steam and fry in oil.\n" +"Add this to the mutton, before serving.\n" +"Garnish with fried onions.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Lamb Bhuna");
        cv.put(DESCRIPTION,"spicy Lamb Bhuna...");
        cv.put(INGREDIENTS,"To Marinate\n" +"Boneless lamb – 1kg\n" +"Natural yogurt – 150 ml\n" +"Lime juice or Vinegar - 5 tbsp\n" +"Red chilli powder – 2 tbsp\n" +"Paprika powder – 1/2 tbsp\n" +"Corianderpowder - 1/2 tbsp\n" +"Turmericpowder - 1/2 tsp\n" +"Cumin (Jeera) powder - 1/2 tbsp\n" +"For the Gravy\n" +"Onion - 300 gm\n" +"(finely chopped)\n" +"Ginger - 2 inch tuber\n" +"Garlic - 25 gm\n" +"Tomatoes – 300 gm\n" +"(chopped)\n" +"Bay leaves – 5 nos\n" +"Cloves - 4 nos\n" +"Cinnamon – 1 inch stick\n" +"Cardamom - 4 nos\n" +"Staranise - 1 no\n" +"GaramMasala - 1/2 tsp\n" +"Dried fenugreek (Methi) leaves – 5 gms\n" +"Mintleaves - 1/2 bunch\n" +"(chopped)\n" +"Water - 500ml\n" +"(add more if required)\n" +"Oil - 5 tbsp\n" +"Salt - to taste");
        cv.put(PROCEDURE,"Cut Lamb into 2inchx2inch dices. Wash.\n"+"Mix all powders in Yogurt under the Marinate section. Add the Lamb dices, cover and marinate for 4 hours.\n" +"Make a fine paste of Ginger and Garlic.\n" +"Heat Oil in a heavy bottomed pan and add Onion, Salt and sautT till golden brown.\n" +"Add the Bay leaves, Cloves, Cinnamon, Cardamom, Star anise, Fenugreek leaves, Garam Masala and sautT for 2 minutes.\n" +"Add Tomatoes, Ginger and Garlic paste and sautT till the Oil starts leaving the Tomatoes & Onion (about 15 minutes)\n" +"Add marinated Lamb dices, water, bring to boil.\n" +":- Leave on high flame for 30 minutes.\n" +"Lower the flame, simmer for about 60 minutes by stirring occasionally.\n" +"Sprinkle half of the Mint leaves and mix in well.\n" +"Simmer for another 30 minutes on low flame, stirring occasionally.\n" +
                "Simmer till Lamb is well done and the water is reduced to a thick consistency.\n" +"Sprinkle rest of your Mint leaves, leave to simmer for 5 more minutes.\n" +":- Serve Lamb Bhuna hot with Jeera Rice!!!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Special Veg Curry");
        cv.put(DESCRIPTION,"Easy veg curry..");
        cv.put(INGREDIENTS,"Potato (medium) - 2 nos(cut into medium sized pieces)\n" +"Carrot - 2 nos(cut into medium sized pieces)\n" + "Onion - 1 no(chopped)\n" +"Tomato - 1 no(chopped)\n" +"Ginger -garlic paste - 1 tbsp\n" +"Red chilly powder - 1 tsp\n" +"Corianderpowder - 2 tsp\n" +"Turmeric - 1/4 tsp\n" +"Fennelseeds (Perumjeerakam) - 1/4 tsp\n" +"Cuminseeds (Jeerakam) - 1/4 tsp\n" +"Dry red chillies - 3 nos\n" +"Curryleaves - Few\n" +"Coconut (shredded) - 4 tbsp\n" +"Salt - As reqd\n" +"Oil - As reqd");
        cv.put(PROCEDURE,"Heat oil in a pressure cooker, add onion and saute well. Add salt to get onion saute easily. Add ginger-garlic paste and saute for a minute.\n" +"Add red chilly powder and coriander powder. Saute for 2 minutes.\n" + "To this add chopped tomato. When tomatoes are cooked well, add carrot and potato. Mix well to make the masala evenly coated. Add water just enough to dip the vegetables. When boiling starts, close the lid and cook till 3 whistles.\n" +"Meanwhile in a pan, roast coconut, fennel and cumin with turmeric in medium flame until golden brown in color. Grind them with required amount of water to make a paste. Add this to the cooked veg.\n" +"Splutter mustard, dry red chillies and curry leaves in oil and add this to veg curry and boil. Add salt if needed.\n" +
                "Goes well with porotta, naan, chappathi etc. You can add more vegetables like beans, green peas, cauliflower, etc..\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Vankaya");
        cv.put(DESCRIPTION,"Brinjal(Vazhuthananga) curry ..");
        cv.put(INGREDIENTS,"Eggplants(Brinjal/Vazhuthananga)\n" +"Greenchillies - As reqd\n" +"Corianderleaves - A bunch\n" +"Dry or Fresh Coconut - As reqd\n" +"Salt - As reqd\n" +"Turmericpowder - A pinch\n");
        cv.put(PROCEDURE,"Cut brinjals into 4 sections taking off the stems into water.\n"+"Heat oil in a pan.\n" +"Add the brinjal pieces.\n" +"Grind together green chillies, coriander leaves, salt, turmeric powder and coconut.\n" +"Add this paste to the brinjals along with a little water.\n" +"Cover and cook until soft.\n" +"Garnish with a little coriander leaves.\n" +":- Serve hot with rice.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Achari Gobi");
        cv.put(DESCRIPTION,"Hot and tangy cauliflower curry..");
        cv.put(INGREDIENTS,"Cauliflower - 1 no\n" +"Nigella/Kalonji** seeds - 3/4 tsp\n" +"Mustardseeds - 3/4 tsp\n" +"Fennelseeds (Perinjeerakam) - 3/4 tsp\n" +"Cuminseeds (Jeerakam) - 3/4 tsp\n" +"Fenugreekseeds (Uluva) - 3/4 tsp\n" +"Redchillies - 3 nos\n" +"(broken into small pieces)\n" +"Asafoetida(Kayam) - A pinch\n" +"Red chilly powder - 1 tsp or as reqd\n" +"Turmericpowder - 1/2 tsp\n" +"Green chilly - 1 no\n" +"(finely chopped)\n" +"Lemon juice - 1 tbsp\n" +"Water - As reqd\n" +"Salt - As reqd\n" +"Oil - 3 tbsp or as reqd\n" +"Coriander leaves and julienned ginger for garnishing\n" +"Kalonji** - It can also be found under these names black caraway\n" +
                "roman coriander\n" +"or black onion seeds.");
        cv.put(PROCEDURE,"Heat oil in a pan and add all the seeds(kalonji, mustard, fennel, cumin and fenugreek), whole red chili and asafoetida and allow it to splutter.\n" +"Add cauliflower, turmeric, red chilly powder and green chilly and mix well.\n" +"Add lemon juice, water and salt.\n" +"Cook until cauliflower is done to your liking and all the water has evaporated.\n" +"Garnish with coriander leaves and julienned ginger.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ajwaini Aloo");
        cv.put(DESCRIPTION,"Baby potatoes tasty side dish..");
        cv.put(INGREDIENTS,"Baby potatoes - 500 gms\n" +"Oil - 3 tbsp\n" +"Ajwain (carom seeds) - 1 tsp\n" +"Red chilli powder - 1 tsp\n" +"Jeera(cumin seeds) powder - 1/2 tsp\n" +"Amchoor(dry mango powder)- 1 tsp\n" +"Kasoori methi (dry fenugreek leaves) - 1 tsp\n" +"Salt - to taste\n" +"Hara dhania(green coriander)- 2 tsp");
        cv.put(PROCEDURE,"Boil and peel the potatoes.\n" +"Heat the oil in a pan and splutter the ajwain.\n" +"Add the remaining ingredients and the potatoes.\n" +"Mix well and saute over medium heat for about 5-7 minutes.\n" +"Serve hot with chapattis.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aloo Bhaji");
        cv.put(DESCRIPTION,"tasty north indian side dish for breakfast..");
        cv.put(INGREDIENTS,"8 medium size potatoes boiled and cubed\n" +"10-12 curry leaves\n" +"½ ” pc ginger chopped\n" +"4-6 green chilies chopped\n" +"½ tsp rye\n" +"½ tsp whole jeera\n" +"½ tsp urad dal\n" +"½ tsp haldi powder\n" +"3 tbsp oil\n" +"Salt");
        cv.put(PROCEDURE,"Boil the potatoes and cut into cubes.\n" +"In a mortar and pestle mash the chopped ginger, green chilies and salt to a coarse paste.\n" +"Heat oil in a non stick pan. Add rye and when it crackles add the whole jeera and urad dal and fry till the dal turns a golden brown color.\n" +"Add the curry leaves and the minced ginger , green chilies and salt paste and stir fry for 1 minute. Add the haldi powder and fry for one more minute.\n" +"Add the boiled potato cubes and mix well till the potatoes are coated with the masala.\n" +"Serve hot with puris and a wedge of lime.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Avial");
        cv.put(DESCRIPTION,"Traditional Kerala vegetable dish..");
        cv.put(INGREDIENTS,"Vegetables like Potato\n" +"Carrot\n" +"Cucumber\n" +"Ashgourd\n" +"Beans\n" +"Drumsticks cut into long pieces - 3 cups\n" +"Sliced onions - 1/2 cup\n" +"Tomatoes sliced - 1/2 cup\n" +"Greenchillies - 5 (slit lengthwise)\n" +"Turmericpowder - 1/2 tsp\n" +"Coconut grated - 1/2 cup\n" +"Cummin seeds (jeera) - 1/2 tsp\n" +"Shallots - 3\n" +"Curds - 1/2 cup\n" +"Coconutoil - 1 tbsp\n" +"Curryleaves - a few\n" +"Salt to taste\n" +"Water as required\n");
        cv.put(PROCEDURE,"In a pan boil and cook the vegetable pieces, onion slices, tomato slices, green chillies, turmeric powder, enough water and salt.\n" +"Grind the coconut, jeera and shallots into a coarse paste\n" +"Add the ground coconut mixture to the cooked vegetables and cook for a few minutes till water has dried up\n" +"Add the curds and boil for a few minutes\n" +"Add curry leaves and coconut oil to the mixture, cover and take off the fire\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Babycorn Gravy");
        cv.put(DESCRIPTION,"Babycorn Gravy..");
        cv.put(INGREDIENTS,"Babycorns - 6 nos\n" +"Onion - 2 nos\n" +"Tomato - 2 nos\n" +"Oil - 1 tsp\n" +"Mustardseeds - 1 tsp\n" +"Fennelseeds (Perinjeerakam) - 1 tsp\n" +"Ginger -garlic paste - 1 tbsp\n" +"Chillipowder - 1 tsp\n" +"Corianderpowder - 1 tsp\n" +"Garam masala powder - 2 tsp\n" +"Salt - As reqd\n" +"Coriander leaves for garnishing");
        cv.put(PROCEDURE,"Pressure cook the babycorns with little salt till they become soft.\n" +"Cut them into small pieces and keep aside.\n" +"Chop the onions and tomatoes separately.\n" +"Heat oil in a pan.\n" +"Add the mustard and the fennel seeds.\n" +"When they start to splutter, add the chopped onions to it.\n" +"Fry, till they turn golden brown in colour.\n" +"Add ginger-garlic paste and fry well.\n" +"Add the chopped tomatoes and fry thoroughly.\n" +"Add all the masalas and little water.\n" +"Bring it to boil.Then add the cooked babycorns.\n" +"Cover and cook for another 2 mins.\n" +"Garnish with coriander leaves.\n" +":- Serve hot with naan, chappathi or roti.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beans Fry");
        cv.put(DESCRIPTION,"Beans stir fry..");
        cv.put(INGREDIENTS,"Beans - 250 gm\n" +"Redchillies (Kollamulaku) - 3 nos\n" +"Blackgram (Uzhunnuparippu) - 1 tsp\n" +"Asafoetida(Kayam) - A pinch(optional)\n" +"Salt - As reqd\n" +"Turmericpowder - 1/4 tsp\n" +"Oil - 1 tsp\n" +"Curryleaves - A few ");
        cv.put(PROCEDURE,"Cut the beans into small pieces of about 1 inch size.\n" +"Wash the beans and put them a bowl along with salt, turmeric powder and cook in low flame.\n" +"Cook them till they become\n" +"soft. Once it becomes soft, remove from the flame.\n" +"Drain the vegetable and keep it aside.\n" +"Heat oil in a pan and fry the red chillies, black gram and asafoetida for a few seconds.\n" +"Add cooked beans and fry for 2 minutes.\n" +"Add curry leaves. Saute till beans is fried.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Andhra Pulihora");
        cv.put(DESCRIPTION,"Pulihora/Tamarind Rice..");
        cv.put(INGREDIENTS,"Sona Masoori rice - 6 cups\n" +"(uncooked)\n" +"Tamarind (Puli) - 36 one inch pieces(or 2 lemons sized of tamarind)\n" +"water -1cup for soaking the tamarind\n" +"Greenchillies - 15 nos\n" +"(make small slits)\n" +"Curryleaves - 1 bunch\n" +"Redchillies - 5 nos\n" +"Mustardseeds - 2 tbsp\n" +"Ginger - 1 1/2 \" piece\n" +"(finely minced)\n" +"Turmericpowder - 1 1/2 tsp\n" +"Sugar - 1 tsp\n" +"Salt - 6 1/2 tsp\n" +"Ground nuts(Nelakadala) - 1/2 cup\n" +"(roasted)\n" +"Bengalgram (Kadalaparippu) - 1/2 cup\n" +"Blackgram (Uzhunnuparippu) - 1/4 cup\n" +"Cashews - 1/8 cup\n" +"Oil - 1 1/4 cups\n" +"Cuminseeds (Jeerakam) - 1 tsp\n" +"Asafoetida(Kayam) - 1 pinch(optional)");
        cv.put(PROCEDURE,"Soak Bengal gram in water for 30 mins.\n" +"Mix this soaked dal with washed and drained rice.\n" +"Pressure cook it with 12 cups of water.\n" +"Rinse the tamarind and soak it in 1 cup of water for 30 mins or microwave it for 7 mins with 1 cup of water.(total extract will measure to 1.5cup).\n" +"Extract the pulp of it and keep aside.\n" +"Heat oil in a pan.\n" +"Add Bengal gram, black gram and 1 tbsp of mustard seeds.\n" +"Once they splutter, add roasted grounduts and cashews and saute for a while.\n" +"Add cumin seeds, ginger, green chillies, red chillies and curry leaves and saute for a while.\n" +"Add the tamarind pulp and saute for another 2 mins.\n" +"Cover and cook for 8 mins on medium flame, until the oil separates.\n" +
                "Add sugar, salt and turmeric and switch off the stove.\n" +"Grind together 1 tbsp of mustard seeds, 1 red chilly and asafoetida(optional) and keep aside.\n" +"Mix together the pressure cook dal-rice mixture with the sauteed masala.\n" +"Add the ground mixture to the above and mix well.\n" +":- Rice should not be sticky. Adjust the water as per your rice quality. Sometimes, rice may need little/more water for cooking. For better results, add few drops of lemon juice or oil to the rice while cooking.\n" +":- Add as much curry leaves for better flavour.\n" +":- This can be stored in a refrigerator for 1 week.\n" +":- I use exact measures of the ingredients as mentioned above everytime. Please adjust the chillies and salt as per your taste.\n" +
                ":- Pulihora recipe is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Vegetable Pulav");
        cv.put(DESCRIPTION,"Vegetable Pulav..");
        cv.put(INGREDIENTS,"Rice - 1 1/2 cups\n" +"Mixed vegetables - 1 cup\n" +"(Potatoes\n" +"Peas\n" +"Beans\n" +"Carrots\n" +"Cabbage)\n" +"Tomato - 1 no\n" +"Onion (big) - 1 no\n" +"Ginger -garlic paste - 1 1/2 tbsp\n" +"Oil - 2 tbsp\n" +"Tumeric powder - 1/2 tsp\n" +"Garammasala - 1 tbsp\n" +"Coriander leaves for garnishing");
        cv.put(PROCEDURE,"Soak rice for about 20 minutes.\n" +"Heat oil in a pressure cooker.\n" +"Add ginger-garlic paste and fry till raw smell goes off.\n" +"Add chopped onions and fry until it turns golden colour.\n" +"Add tomato and fry for some time.\n" +"Add all the vegetables and fry again.\n" +"Add rice along with 2 1/2 cups of water.\n" +"Add salt, turmeric powder and garam masala.\n" +"Pressure cook till you hear 2 whistles.\n" +"Garnish with coriander leaves.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ghee Rice");
        cv.put(DESCRIPTION,"Simple Ghee Rice ..");
        cv.put(INGREDIENTS,"Biriyani rice : 2 ½ cup\n" +"Onion : 2 nos (slices)\n" +"Onion : 1 no (chopped)\n" +"Ginger -garlic paste : 1 ½ tsp\n" +"Garam masala : 2 tsp\n" +"Cahewnut/ raisins : 1 tsp\n" +"Ghee : as reqd\n" +"Salt : as reqd\n" +"Water : 5 ½ cup ");
        cv.put(PROCEDURE," In a pan, add little ghee and fry the rice till slightly crispy.\n" +"Keep this aside.3) In the pan, heat a tsp of ghee and oil.4) Add onion chopped and ginger-garlic paste and sauté well.\n" +"Add the fried rice and mix well.6) Mean while boil the water with salt and garam masala.7) Add the fried rice into it.8) Allow it to cook in low fire.\n" +"When done, transfer into small plate.10) Fry the sliced onion in oil and mix with the cooked rice and serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bagara Rice");
        cv.put(DESCRIPTION,"Hyderabadi - Bagara Rice..");
        cv.put(INGREDIENTS,"Rice - 2 cups\n" +"Onions - 2 nos\n" +"(cut straight)\n" + "Greenchillies - 3 nos\n" +"(slit)\n" +"Mintleaves (Pudhina) - 1 small cup\n" +"Bay leaves(Vazhana/Karuga ela) - 2 - 3 nos\n" +"Cloves (Grambu) - 3 - 4 nos\n" +"Cinnamon(Karugapatta) - 2 small sticks\n" +"Curd - 1/2 cup\n" +"Salt - As reqd\n" +"Ghee - As reqd\n");
        cv.put(PROCEDURE,"Heat ghee in a pressure pan.\n" +"Add bay leaves, cloves, cinnamon and mint leaves.\n" +"Fry for a while.\n" +"Add onions and green chillies and saute.\n" +"Add curd and salt.\n" +"Add the rice along with 1 1/2 cups of water.\n" +"Close the lid and cook upto 2 - 3 whistles.\n" +":- Serve hot with raita or chicken gravy.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bisibele Bhath");
        cv.put(DESCRIPTION,"Rice and dal combination dish..");
        cv.put(INGREDIENTS,"Rice - 1 cup\n" +"Red gram(Thuvaraparippu) - 3/4 cup\n" +"Onions(peeled) - 1 cup\n" +"Potatoes (diced) - 1 cup\n" +"Peas - 3/4 cup\n" +"Tomatoes(Large) - 2 nos\n" +"Tamarind juice - 2 tbsp\n" +"Salt - As reqd\n" +"Ghee - 3 tbsp\n" +"Oil - 4 tbsp\n" +"Bisibele bhath masala powder-2 tsp\n" +"Turmericpowder - 1/2 tsp\n" +"Chillypowder - As reqd\n" +"Chopped coriander leaves\n" +"Fresh grated coconut\n" +"For bisibele bhath masala powder:\n" +"Corianderseeds (Malli) - 2 tsp\n" +"Fenugreek(Uluva) - 1/4 tsp\n" +"Cinnamon(Karugapatta) - 1\" piece\n" +"Cloves (Grambu) - 3 nos\n" +"Cardamom (Elakka) - 1 no\n" +"Redchillies (Kollamulaku) - As reqd\n" +"Grated dry coconut");
        cv.put(PROCEDURE,"For making the masala powder:\n" +"1)Roast all the ingredients in little oil, till good smell comes. Add dry coconut and fry for another minute. Grind it and store in a air tight container.\n" +"For making Bisibele Bhath:\n" +"1)Cook diced potatoes (don`t overcook).\n" +"Pressure cook red gram/toor dhal by adding turmeric powder.\n" +"Cook rice separately and allow it to cool.\n" +"Soak tamarind in water for sometime and then extract the juice.\n" +"Heat oil in a pan.\n" +"Add little bisibele bhath masala powder.\n" +"Add onions and fry them till translucent.\n" +"Add tomatoes and cook for another 3 minutes.\n" +"Add peas, cooked potatoes and cooked dal.\n" +"Add remaining masala powder, tamarind juice and about 1 cup of water and bring it to boil.\n" +"Add salt and chilly powder as required.\n" +"While boiling, add cooked rice and simmer for another 5 minutes.\n" +
                "Garnish with fresh coriander leaves and fresh grated coconut.\n" +"Pour little ghee on top.\n" +":- Serve hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Capsicum Rice");
        cv.put(DESCRIPTION,"Spicy Capsicum rice is a variant from the usually available ones. The dish is tasty and very easy to prepare...");
        cv.put(INGREDIENTS,"Rice - 200 gm\n" +"Bengalgram (Kadalaparippu) - 3 ½ tbsp\n" +"Blackgram (Uzhunnuparippu) - 2 ½ tbsp\n" +"Capsicum - 5 nos\n" +"Other Veggies like carrot\n" +"beans etc - 1 cup (optional)\n" +"Cashewnuts - 8 nos\n" +"Cinnamon(Karugapatta) - 1\" stick\n" +"Corianderseeds - 2 tbsp\n" +"Cumin(Jeerakam)seeds - ½ tbsp\n" +"Curryleaves - 3 nos\n" +"Grated coconut - ½ tbsp\n" +"Lemon - 1 no\n" +"Mustardseeds - ½ tbsp\n" +"Oil - 3 tbsp\n" +"Peanuts(Nelakadala) - 1 tbsp\n" +"Whole red chillies(Kollamulaku) - 8\n" +"Turmericpowder - ¼ tsp\n" +"Coriander leaves for garnishing ");
        cv.put(PROCEDURE," Fry the red chillies, cinnamon, coriander seeds, cumin seeds and black gram dal in a teaspoon of ghee or oil till golden brown. Powder and keep aside.\n" +"Cook rice until 3/4 cooked. Drain the water from the rice, spread and cool. Mix a teaspoon of oil or ghee to it and keep aside.\n" +"Heat oil and add mustard seeds, Bengal gram, red chillies, curry leaves, cashew nuts, and peanuts one by one and fry till golden brown in colour.\n" +"Add veggies n saute followed by diced capsicum and fry till soft.\n" +"Reduce heat and add grated dry coconut. Fry until light brown.\n" +"Add turmeric powder, salt and the cooked rice. Fry for a few minutes until the rice is hot.\n" +"Squeeze lemon juice and powdered masala. Mix well.\n" +"Garnish with chopped coriander leaves.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chinese Fried Rice");
        cv.put(DESCRIPTION,"Delicious Fried rice - Chinese Cuisine..");
        cv.put(INGREDIENTS,"Basmati rice - 2 cups\n" +"Chopped carrot - 1 cup\n" +"Chopped beans - 1 cup\n" +"Greenpeas - 1/2 cup\n" +"Chopped spring onion - 1/2 cup\n" +"Soya sauce - 4 tbsp\n" +"Pepperpowder - 2 tsp\n" +"Ajinomoto - 1/2 tsp(Optional)\n" +"Salt - As rqrd\n" +"Oil - 1 tbsp\n" +"Garlic - 1 tsp\n" +"(chopped)");
        cv.put(PROCEDURE,"Wash and cook basmati rice till it is 80% done. Drain the rice and keep it aside.\n" +"Steam cook chopped carrot and beans.\n" +"Heat 1 tablespoon oil in a large chinese kadai and add chopped garlic.\n" +"When garlic becomes golden brown, add cooked carrot and beans and saute for a while.\n" +"Add cooked rice along with soya sauce, pepper powder, salt and ajinomoto.\n" +"Mix it well and keep it in a low flame for 20 minutes.\n" +"Add chopped spring onion and mix it again and remove from fire.\n" +":- If you want to make this a non veg fried rice, you can add scrambled egg(or you can add beaten egg to the cooked vegetables and scramble it) or cooked mince chicken / prawns (cook chicken/prawns by adding little salt, pepper powder and garam masala) or any other non veg according to your taste and creativity.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chitrannam");
        cv.put(DESCRIPTION,"Andhra Festival Special - Pulihora..");
        cv.put(INGREDIENTS,"Fine rice(not Basmathi rice) - 1/2 kg\n" +"Tamarind extract - 1 cup\n" +"Cashew - 150 gm\n" +"Green chilli pieces - 1 cup\n" +"Redchillies - 10 nos\n" +"Ginger (finely chopped) - 1/2 cup\n" +"Bengalgram (Kadalaparippu) - 2 tbsp\n" +"Mustardseeds - 1 tbsp\n" +"Curryleaves - 2 fist fulls\n" +"Lemon - 1 no\n" +"Salt - As reqd\n" +"Turmericpowder - 1 tbsp\n" +"Refined oil - 1 small cup");
        cv.put(PROCEDURE,"Add half of the green chillies pieces to tamarind paste and cook on low flame until it becomes thick.\n" +"Cook the rice and take the cooked rice into a wide plate.\n" +"Add turmeric powder and 2 tbsp of oil and mix well until entire rice becomes uniform yellow.\n" +"Heat oil in a frying pan.\n" +"Add cashew nuts, Bengal gram, remaining green chilly pieces, red chillies, chopped ginger, mustard seeds and curry leaves and fry.\n" +"Add the above ingredients and salt to the rice.\n" +"Add the tamarind paste along with the green chilli pieces into the rice. Mix well.\n" +"Add lime juice if required.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Akki Roti");
        cv.put(DESCRIPTION,"Hand made Rice Rotis..");
        cv.put(INGREDIENTS,"Ground Rice powder - 1 glass\n" +"Onion - 1 no\n" +"Corianderleaves\n" +"Greenchillies - 2 - 3 nos\n" +"Oil - 10 - 12 tsp\n" +"Salt - As reqd\n" +"Water - As reqd");
        cv.put(PROCEDURE,"Cut onions, coriander leaves and green chillies into small pieces.\n" +"Add the above to the rice powder with salt and mix with water to make a dough.\n" +"Add oil to this in order to avoid getting stuck to the hands.\n" +"Apply oil on a polythene paper.\n" +"Make balls of the rice mix and spread one on the paper with your hand in the shape of rotis.\n" +"Heat oil in a pan.\n" +"Put the roti in it and cook with oil, just like normal dosa.\n" +"Repeat the procedure for the remaining dough.\n" +":- Serve with tomato-onion chutney.\n" +":- This can be had as a snack or as breakfast. It`s very crispy like onion vadas.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aloo Paratha");
        cv.put(DESCRIPTION,"Simple and tasty..");
        cv.put(INGREDIENTS,"WheatFlour (Atta)\n" +"Salt\n" +"Oil\n" +"Water\n" +"Potatoes\n" +"(boiled peeled and mashed)\n" +"Greenchillies\n" +"Curryleaves\n" +"Corianderleaves");
        cv.put(PROCEDURE,"Cut the potatoes into half and boil it.\n" +"Once done, peel the skin off the potatoes and mash it with hand or a spoon.\n" +"Cut green chillies and add it to the potatoes along with a pinch of salt, curry leaves and coriander leaves.\n" +"Knead flour as required into a soft dough by adding salt as required with water.\n" +"Make balls off the dough.\n" +"Roll them into slightly thick small rotis.\n" +"Fill the potatoes fiiling into it.\n" +"Fold the roti and roll them into slightly thick rotis.\n" +"Oil the heated kadai or tava and place the roti on it and keep turning the sides of the roti.\n" +":- Do not forget to apply required oil, butter or ghee as required on both the ends.\n" +":- Serve it hot with Curd or Pickle or any of Your Fav curries.\n" +":- Portions are not mentioned as it can be taken in required quantity depending on the no. of members to be served.\n" +
                ":- Easy to make and tasty to eat.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Batura");
        cv.put(DESCRIPTION,"Real Taste of North Indian Breakfast..");
        cv.put(INGREDIENTS,"Maida - 2 cups\n" +"Plain yogurt – 2 ½ tbsp\n" +"Salt - to taste\n" +"Baking soda – a pinch\n" +"Sugar - 1 tsp\n" +"Oil - for deep frying");
        cv.put(PROCEDURE,"Make a dough with the above ingredients (Can add water to make the dough).\n" +"Allow it to ferment for 8 hours.\n" +":- In winter, you may have to make the dough with lukewarm water.\n" +"Shape into round balls and roll it.\n" +"Deep fry in oil.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bhakri");
        cv.put(DESCRIPTION,"Jowar Roti..");
        cv.put(INGREDIENTS,"Jowar Flour - 2 cups\n" +"Warm water\n" +"Salt - 1 tsp");
        cv.put(PROCEDURE,"Take jowar flour in a vessel and make a well in the middle. Add salt and warm water.\n" +"Knead nicely to make a soft dough.\n" +"Make round balls out of this dough.\n" +"On a flat surface, sprinkle little jowar flour and pat the ball with your palm. Use flour as required. Keep flattening the ball in circular motion to make round shape like roti. Don`t make it too thin. Bhakri should be of equal thickness so that it get puffed.\n" +"Keep ready a small piece of clean cloth and water in a vessel.\n" +"Heat a griddle(or a flat pan) and slide bhakri from the flat surface and place it on the griddle. It should be in such a way that, the lower surface of the bhakri should go on the tawa(upper surface upwards). Lower the flame.\n" +"Now with the help of wet cloth, spread water on the bhakri. Then immediately turn on the bhakri to cook the other side.\n" +
                "Now remove from griddle and hold it on the direct flame. With the help of spatula, press a bit to get puffed.\n" +"Roast on both sides till you get small black spots.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chapati");
        cv.put(DESCRIPTION,"North Indian chappathis..");
        cv.put(INGREDIENTS,"Wheatflour - 1 cup\n" +"Allpurposeflour (Maida) - 1/2 cup\n" +"Hot water - 3/4 cup\n" +"Salt - As reqd\n" +"Oil - 2 tbsp");
        cv.put(PROCEDURE,"Take a medium sized bowl and put wheat flour, all purpose flour, salt and mix well.\n" +"Add hot water and mix the dough with a spoon(wooden spoon).\n" +"Add oil and mix the dough smoothly using your hand.\n" +"Close the bowl with its lid and keep for an hour.\n" +"Take the dough and make 8 lemon sized dough balls.\n" +"In a flat surface, roll each ball sized dough to a circular shape.\n" +"We can use extra flour to avoid the stickiness of dough during rolling if needed.\n" +"Heat a pan and put 1/2 tsp of oil and fry the rolled dough.Turn upside down and fry the side.\n" +"Cook it till done.\n" +":-Repeat same for rest of the dough balls.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chilli Paratha");
        cv.put(DESCRIPTION,"Spicy Paratha dish with capsicum and chick peas..");
        cv.put(INGREDIENTS,"Frozen Paratha - 6 nos\n" +"(Bring to room temperature before cooking)\n" +"Chick Peas(Garbanzo Beans) - 1 can\n" +"Capsicum (julienned) - 1 no\n" +"Tomato - 2 nos\n" +"(cut into big chunks)\n" +"Onion (julienned) - 1 no\n" +"Ginger -Garlic paste - 1 tbsp\n" +"Chillypowder - 1 tbsp\n" +"Corianderpowder - 2 tbsp\n" +"Garam masala powder - 1 tsp\n" +"Cinnamon\n" +"Cloves\n" +"Bay Leaf\n" +"Lemon juice - 1/2 tbsp\n" +"Butter- 1 - 2 tbsp\n" +"Coriander leaves for garnishing\n" +"Cashewnuts for garnishing");
        cv.put(PROCEDURE,"Heat butter in a pan.\n" +"Add the spices and saute.\n" +"Add ginger-garlic paste followed by onions and tomatoes.\n" +"Add chilly powder, coriander powder, garam masala and salt.\n" +"When it is done, add the cooked chick peas. Mix thoroughly.\n" +"Cook the parathas as per the instructions on the package.\n" +"Tear the parathas into bite size pieces and add this to the masala.\n" +"Cook, until the paratha and masala get mixed together.\n" +"Add lime juice and mix well.\n" +"Garnish with coriander leaves and cashewnuts fried in ghee.\n" +":- Serve hot with onion raitha.\n" +"Note: To make it more colorful you can add Yellow and Red Bell Peppers.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Gobi Ke Poori");
        cv.put(DESCRIPTION,"Pooris made with grated gobis..");
        cv.put(INGREDIENTS,"Wheatflour - 1 cup\n" +"Grated cauliflower - 1/2 cup\n" +"Ginger -Garlic paste - 1/2 tsp\n" +"Green chilly(chopped) - 1 no\n" +"Cuminseeds (Jeerakam) - 1/4 tsp\n" +"Salt - As reqd\n" +"Oil - for frying");
        cv.put(PROCEDURE,"Mix together all the above ingredients.\n" +"Add 2 tbsp of oil and knead it to make a smooth dough.\n" +"Roll the dough into poories.\n" +"Deep fry them in hot oil.\n" +":-Serve with Green Chutney or with Tomato Ketchup.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Kuki Paratha");
        cv.put(DESCRIPTION,"A wheat roti..");
        cv.put(INGREDIENTS,"Wheatflour - 4 cups\n" +"Onion - 2 nos\n" +"(sliced finely lengthwise)\n" +"Greenchillies - 4 nos\n" +"(minced)\n" +"Corianderleaves (chopped) - As reqd\n" +"Milk - 1 cup\n" +"Salt - As reqd\n" +"Vanaspati - 2 tbsp");
        cv.put(PROCEDURE,"Mix all the above ingredients in a bowl and knead them together into a soft dough by addiing water if necessary. Keep aside for 30 minutes.\n" +"Make balls off the dough.\n" +"Roll them and roast them on tawa like other parathas using vanaspati.\n" +":- Serve with mango pickle.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aloo Channa Chaat");
        cv.put(DESCRIPTION,"A different recipe..");
        cv.put(INGREDIENTS,"Potato - 2 nos\n" +"Chick peas - 3/4 cup(soaked overnight)\n" +"For dressing:\n" +"Lemon juice - 4 tbsp\n" +"Cuminpowder (Jeerakam) - 2 tsp\n" +"Chaat masala - 2 tsp\n" +"Salt - As reqd\n" +"Ground nut oil - 5 tbsp\n" +"To garnish:\n" +"Mintleaves - As reqd\n" +"Onion - 1 no(rings)\n" +"Tomato - 1 no(rings)");
        cv.put(PROCEDURE,"For preparing aloo-channa chaat, cook potato, peel and dice it.\n" +"Cook channa with salt and a pinch of soda powder.\n" +"Mix the dressing ingredients in a bowl. Add potato and cooked channa and mix well.\n" +"Spread in a salad plate and garnish with onion and tomato rings.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American KFC Coleslaw");
        cv.put(DESCRIPTION,"Make homade coleslaw..");
        cv.put(INGREDIENTS,"Cabbage (very finely chopped) - 8 cups\n" +"Carrot (medium) - 1/4 cup\n" +"Granulated sugar - 1/3 cup\n" +"Salt - 1/2 tsp\n" +"Pepper - 1/8 tsp\n" +"Milk - 1/4 cup\n" +"Mayonnaise - 1/2 cup\n" +"Buttermilk - 1/4 cup\n" +"White vinegar - 1 1/2 tbsp\n" +"Lemon juice - 2 1/2 tbsp ");
        cv.put(PROCEDURE,"Chop cabbage and carrot into very fine pieces about the size of rice kernels.\n"+"Combine sugar, salt, pepper, milk, mayonnaise, buttermilk, vinegar and lemon juice and beat until smooth.\n" +"Add the chopped cabbage and carrot and mix well.\n" +"Cover and refrigerate for atleast 2 hrs before serving.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Andhra Easy Fruit Salad");
        cv.put(DESCRIPTION,"Custard/Fruit salad/Pudding..");
        cv.put(INGREDIENTS,"Milk - 1 litre\n" +"Sugar - 1 1/2 cups\n" +"Custard Powder - 5 tsp\n" +"Raisins (Onakka munthiri) - A few\n" +"Ripe Banana - 1 no\n" +"Apple - 1 no\n" +"Orange (optional) - 1 no (use rind)\n" +"Grapes - 15 nos\n" +"Cashewnuts - A few\n" +"Almonds - peeled and chopped\n" +"Pistachios - peeled and chopped\n" +"Ghee - 3 tsp");
        cv.put(PROCEDURE,"Soak chopped almonds in milk for about an hour.\n" +"Take milk in a thick bottomed vessel and add soaked alomonds and boil over medium flame. Stir it continuously or else the milk will get burnt and stick to the bottom of the vessel.\n" +"Meanwhile, mix custard powder in about 1/2 cup of cold milk and add the mixture to the boiled milk slowly and keep stirring continuously on a very low flame.\n" +"Add sugar, mix it well and switch off the stove.\n" +":- The custard can be prepared in microwave oven by boiling the milk along with soaked almonds in a microwave safe bowl for 7-8 minutes. Then mix custard powder in cold milk and add it to the boiled milk and microwave it for 2 more minutes. Finally add sugar and boil for 1 minute and follow from step number 4.\n" +
                "Cool the custard by placing the custard bowl in another bowl of cold water. This cools and thickens the custard.\n" +"Meanwhile, fry the raisins and cashews in ghee and keep it aside.\n" +"When custard is cooled, add half the quantity of cashews and raisins to the custard, mix well and refrigerate for 4 or 5 hours.\n" +
                "Just before serving, take out the custard from the refrigerator and add chopped bananas, apples, grapes and orange to the custard, mix well and garnish with the grated pista and the remaining fried cashews, raisins and serve them in bowls.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beetroot & Carrot Salad");
        cv.put(DESCRIPTION,"If you would like to have a tasty and also a healthy salad, this is the best option. Beetroot with the mix of other vegetables gives us enormous nutritional benefits...");
        cv.put(INGREDIENTS,"Beetroot -half pc\n" +"Green chilli-2\n" +"Onion -half pc\n" +"Cabbage -half pc\n" +"Carrot -1\n" +"Vinegar-2 tbs\n" +"Salt -as required\n" +"Corianderleaves -as required");
        cv.put(PROCEDURE,"Cut the veggies.\n" +"Mix it with salt, vinegar and serve it\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Challaas");
        cv.put(DESCRIPTION,"Challaas(Salad)..");
        cv.put(INGREDIENTS,"Red Onion(medium) - 3 nos\n" +"Green hot chillies(small) - 3-4\n" +"(sliced diagonally)\n" +"Lemon(medium) - 2 nos\n" +"Salt - As reqd\n");
        cv.put(PROCEDURE,"Add salt to the sliced chillies.\n" +"Add some sliced onion and mix well. Use a spoon or hand to squeeze the juices out of the chillies. This works well when mixed with salt.\n" +"Squeeze the juices out of some (about 1 Tbsp) onion slices.\n" +"Mix in the rest of the onion.\n" +"Add the lime juice and mix well.\n" +"Allow it to stand covered for 10-15 minutes.\n" +"Note: Amount of chillies may be increased or decreased depending upon your need.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Amaretti Chocolate Cake");
        cv.put(DESCRIPTION,"Yummy chocolate cake..");
        cv.put(INGREDIENTS,"Amaretti biscuits - 350 gm\n" +"Dark chocolate - 175 gm\n" +"(70-75 percent cocoa solids)\n" +"Double cream - 425 ml\n" +"Brandy - 7 tbsp\n" +"Cocoa powder to dust over the cake\n" +"You will also need a 1.2 litre pudding basin\n" +"lightly greased with any flavourless oil");
        cv.put(PROCEDURE,"Break up the chocolate into a heat proof bowl.\n" +"Pour in the double cream.\n" +"Put the bowl over a pan of barely simmering water and leave, until the chocolate has melted.\n" +"Take the bowl off the heat and with an electric hand mixer, whisk the mixture, until you have a cold creamy mixture.\n" +"Pour the brandy into a shallow dish.\n" +"Dip the biscuits, one at a time, first into the liquor, then into the chocolate cream and arrange a layer of biscuits in the base of the pudding basin.\n" +"Spread a layer of the chocolate mixture over the first layer of biscuits.\n" +"Repeat the whole process, until you have 4 layers.\n" +"Place a saucer (one that fits inside the rim of the pudding basin) on top of the mixture, put some weight on top and leave in the fridge over night.\n" +
                "Before serving, dip the basin in hot water for a few seconds and turn the pudding out on to a flat serving plate.\n" +"Put the cake back into the fridge for 15 mins to allow the outside to get firm again.\n" +"Finally, dust with cocoa powder.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American Brownies");
        cv.put(DESCRIPTION,"Soft chocolate brownies with creamy frosting..");
        cv.put(INGREDIENTS,"    10 tablespoons (1 1/4 sticks, 140 g) unsalted butter\n" +"    1 1/4 cups (250 g) granulated sugar\n" +"3/4 cup plus 2 tablespoons (85 g) unsweetened cocoa powder (natural or Dutch-process)\n" +"    1/4 teaspoon salt\n" +"    1/2 teaspoon almond extract\n" +"    2 cold large eggs\n" +"    1/2 cup (65 g) all-purpose flour\n" +"    2/3 cup (90 g) pecan pieces\n");
        cv.put(PROCEDURE,"1 Preheat oven and line baking pan: Preheat oven to 325°F (160°F), with a rack in the lower third of the oven.\n" +
                "\n" +
                "Line the bottom of an 8-inch square baking pan with foil or parchment paper in such a way as there is an overhang on two opposite sides to make it easy to lift the brownies out when they're done.\n" +
                "\n" +
                "2 Heat butter, cocoa, sugar, salt in a bowl over simmering water: Place the butter, cocoa, sugar, and salt in a medium-sized metal bowl. Fill a large skillet halfway with water and bring to a bare simmer. Set the bowl of the butter cocoa mixture in skillet of simmering water.\n" +
                "\n" +
                "Stir the butter cocoa mixture until the butter has melted and the mixture is smooth and hot to touch.\n" +
                "\n" +
                "Remove the bowl from the skillet and let it cool down a bit, from hot to warm.\n" +
                "\n" +
                "3 Stir in almond extract, eggs, flour, beat with spoon, add pecans: Stir in the almond extract. Stir in the eggs, one at a time, beating strongly after each addition.\n" +
                "\n" +
                "Once the batter is well mixed and shiny and thick, stir in the flour. Beat for 40 strokes with a wooden spoon.\n" +
                "\n" +
                "Mix in the pecans.\n" +
                "\n" +
                "4 Pour batter into lined pan: Pour the batter into the prepared lined pan and smooth the surface evenly.\n" +
                "\n" +
                "5 Bake: Bake 20 to 25 minutes at 325°F (160°C), until a bamboo skewer or toothpick inserted into the center comes still a little moist with the brownie batter. Cool completely on a rack.\n" +
                "\n" +
                "6 Cut: When cooled, lift up the sides of the foil or parchment liner to remove the brownies from the pan. Place them on a cutting board and cut into 16 to 25 squares or rectangles.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American Chocolate Cake");
        cv.put(DESCRIPTION,"Chocolate Bourbon Cake\n");
        cv.put(INGREDIENTS,"\n" +
                "    1 cup (2 sticks) unsalted butter, more for greasing pan\n" +
                "    2 cups all-purpose flour, more for dusting pan\n" +
                "    5 ounces high quality, unsweetened dark chocolate\n" +
                "    1/4 cup instant espresso powder (can use instant coffee)\n" +
                "    2 tablespoons unsweetened natural cocoa powder\n" +
                "    1 cup bourbon whiskey (can use 1/2 cup), more for sprinkling\n" +
                "    1/2 teaspoon kosher salt\n" +
                "    2 cups white granulated sugar\n" +
                "    3 large eggs\n" +
                "    1 tablespoon vanilla extract\n" +
                "    1 teaspoon baking soda\n" +
                "    1/4 cup confectioners’ sugar (powdered sugar), for sprinkling\n");
        cv.put(PROCEDURE,"1 Preheat oven, prepare bundt pan: Preheat oven to 325°F. Butter and flour the inside of a large (10 cup) bundt pan.\n" +
                "\n" +
                "2 Melt chocolate: Melt chocolate in a microwave oven or in a double boiler over simmering water. Let cool. Put a cup of water on to boil.\n" +
                "\n" +
                "3 Mix instant espresso powder, cocoa powder, boiling water, bourbon, salt: Put instant espresso powder (or instant coffee) and cocoa powder in a large (at least 2 cup) glass measuring cup. Add enough boiling water to come up to the 1 cup measuring line. Mix until powders dissolve. Stir in the bourbon and salt. Set aside and let cool.\n" +
                "\n" +
                "4 Beat butter, add sugar, eggs, vanilla, baking soda, melted chocolate: Beat butter until fluffy (2-3 minutes on high using an electric mixer). Add sugar and beat a minute longer. Add the eggs one at a time, beating a minute after each addition. Add the vanilla extract, baking soda and melted chocolate.\n" +
                "\n" +
                "5 Alternate adding bourbon espresso mixture with flour: With the mixer on the lowest speed, beat in a third of the bourbon espresso cocoa mixture. When liquid is absorbed, beat in half of the flour (1 cup). Repeat additions, ending with bourbon mixture.\n" +
                "\n" +
                "6 Bake: Scrape batter into prepared bundt pan and smooth the top. Bake at 325°F until a tester inserted into center of cake comes out clean, about 1 hour 10 minutes.\n" +
                "\n" +
                "7 Cool, sprinkle with whisky and powdered sugar: Move the cake to a rack. Gently un-mold after 15 minutes and sprinkle the cake with a little more bourbon whiskey. Let the cake cool completely before serving. Sprinkle powdered sugar through a mesh sieve over the cake before serving.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Angel White Cake");
        cv.put(DESCRIPTION,"Easy to make white cake; adaptable to variety of flavours and fillings..");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 1 1/2 cups\n" +"Bakingpowder - 1/2 tbsp\n" +"Salt - 1/4 tsp\n" +"Granulated sugar - 3/4 cup\n" +"Butter - 1/4 cup\n" +"Egg whites - 3 nos\n" +"Vanilla essence - 1/2 tsp\n" +"Milk - 1/2 cup");
        cv.put(PROCEDURE,"Heat oven to 350ª.\n" +"Grease and flour a 9-inch round baking pan and set aside.\n" +"Sieve and stir together flour, baking powder and salt in a large bowl. Set it aside too.\n" +"Beat sugar and butter in a large mixer bowl at medium speed, scraping bowl occasionally, until creamy (3 to 5 minutes).\n" +"Add egg whites, 1 at a time, beating well after each addition.\n" +"Add vanilla essence. Reduce speed to low.\n" +"Add flour mixture alternately with milk, beating well after each addition just until mixed (1 to 2 minutes).\n" +"Bake for 29 to 34 minutes or until toothpick inserted in center comes out clean.\n" +"Cool on wire racks for 10 mins.\n" +"Loosen edge of cake by running knife around inside edge.\n" +"Carefully remove cake from pan.\n" +"Cool completely.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple & Honey Cake");
        cv.put(DESCRIPTION,"Cake with Taste of Honey..");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 2 cups\n" +"Light Brown Sugar - 1 cup\n" +"Honey - 1/2 cup\n" +"Milk - 1/2 cup\n" +"Vegetable oil - 1/2 cup\n" +"Ground cinnamon(Karugapatta) - 1 tsp\n" +"Cloves (Grambu) - 1 tsp\n" +"Bakingpowder - 1 tsp\n" +"Baking Soda - 1 tsp\n" +"Apples(diced) - 1 cup\n" +"Eggs - 2 nos (room temperature)");
        cv.put(PROCEDURE,"Preheat oven to 325 degrees.\n" +"Grease and flour or spray with baking spray the baking pan.\n" +"In a large bowl, mix together the eggs, cinnamon, cloves and brown sugar.\n" +"In a small bowl or measuring cup, mix the oil, milk and honey.\n" +"Add baking soda, baking powder and flour to the egg mixture.\n" +"Add in the milk/oil mixtures and stir until it is mixed completely.\n" +"Add the apples and pour into the prepared pan.\n" +"Bake for 40 mins or until a toothpick inserted in the middle comes out clean.\n" +"Cool the cake for about 10 mins in the pan and cool for another 20 mins after removing from the pan.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Bran Muffins");
        cv.put(DESCRIPTION,"Muffin..");
        cv.put(INGREDIENTS,"Allpurposeflour (maida) - 1 cup\n" +"Packed brown sugar - 1/3 cup\n" +"Bakingpowder - 2 tsp\n" +"Salt - 1/2 tsp\n" +"Cinnamon(Karugapatta) - 1/2 tsp\n" +"(ground)\n" +"Nutmeg (Jathikka) - 1/4 tsp\n" +"(ground)\n" +"Tart apple(medium) - 1 no\n" +"(peeled & finely chopped)\n" +"Water - 3/4 cup\n" +"Dry nonfat dry milk(milk powder)-1/2 cup\n" +"Veg oil - 1/4 cup\n" +"Egg (large) - 1 no\n" +"Bran flake cereal - 2 cups");
        cv.put(PROCEDURE,"Preheat oven to 400ª F. Grease or paper-line 12 muffin cups.\n" +"Combine flour, sugar, baking powder, salt, cinnamon and nutmeg in a medium bowl.\n" +"Mix apple, water, dry milk, vegetable oil and egg in a small bowl.\n" +"Add it to the flour mixture and stir until moistened.\n" +"Stir in cereal.\n" +"Spoon into prepared muffin cups, filling 2/3 full.\n" +"Bake for 12 to 15 minutes or until wooden pick inserted in center comes out clean.\n" +"Remove to wire rack; cool slightly.\n" +":- Serve warm.\n" +":- Makes 12 muffins.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Badam Cake");
        cv.put(DESCRIPTION,"Badam or Almonds cake..");
        cv.put(INGREDIENTS,"Badam(Almonds) - 1 cup\n" +"Sugar (very finely powdered) - 1 cup\n" +"Water - 1/4 cup\n" +"Ghee - 2 tsp");
        cv.put(PROCEDURE,"Soak the almonds for an hour and leave it to drain.\n" +"Remove the skin and grind into a thick smooth paste adding minimum water.\n" +"In a thick vessel, mix sugar and 1/4 cup of water and heat.\n" +"When the sugar dissolves completely, add this paste and cook for five minutes.\n" +"Add ghee and remove from fire.\n" +"Pour this mixture on a large plate and smoothen the surface of the mixture with a roller. Then cut with a knife, by drawing parallel lines, in the shape of cubes.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cashew Cake");
        cv.put(DESCRIPTION,"Cake made with cashews..");
        cv.put(INGREDIENTS,"Raw unsalted cashews - 1 cup\n" +"Sugar - 2 cups\n" +"Ghee - 1/2 cup\n" +"Saffron - A pinch\n" +"Milk - 1 tbsp\n");
        cv.put(PROCEDURE,"Soak the cashews in hot water.\n" +"Grind the cashews using milk to a coarse paste.\n" +"Heat a non stick pan.\n" +"Pour the cashew paste and sugar along with 2 tsp of ghee and stir well.\n" +"Keep adding the rest of the ghee as you stir.\n" +"Dissolve the saffron in a tsp of milk and add it the above mixture.\n" +"Once it reaches a layered consistency(something similar to the consistency when chocolate is poured), pour it onto a greased plate. Leave it to cool.\n" +"When it is cool, cut into small squares.\n" +
                ":- Before pouring onto the plate, taste it. If it is very slippery, you will have to stir more to get the cake consistency. Do not worry, if you do not get the correct consistency in the first attempt itself. You can have it as cashew halwa. The right test for the consistency would be to take a ladleful and drop it back into the pan in a slow motion. If it falls in layers, the consistency is right.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Plum Cake");
        cv.put(DESCRIPTION,"Christmas special plum cake..");
        cv.put(INGREDIENTS,"Raisins (Onakka munthiri) - 1 lb\n" +"Dates (Eenthapazham) - 1 lb\n" +"Candied fruits and orange and lemon peel - 1 cup\n" +"Gold rum - 1 cup\n" +"Cashews - 2 cups\n" +"Allpurposeflour (Maida) - 4 cups\n" +"Bakingpowder - 3 tsp\n" +"Butter - 1 lb\n" +"Sugar - 4 cups\n" +"Sugar - 1 cup (to make caramelized syrup)\n" +"Eggs - 12 nos\n" +"Cinnamon(Karugapatta) powder - 1 heaped tsp\n" +"Nutmeg (Jathikka) powder - 1 heaped tsp\n" +"Cloves (Grambu) powder - 1 heaped tsp\n" +"Dryginger (Chukku) powder - 1 heaped tsp\n" +"Salt - 3 tsp\n" +"Pure Vanilla essence - 4 tsp");
        cv.put(PROCEDURE,"Dice the fruits and coat them with 3 tbsp of flour.\n" +"Add rum and mix well.\n" +"Keep this at room temperature over night.\n" +"Dice or crush the nuts into small pieces.\n" +":- You can do these steps the day before you plan to make the cake.\n" +"Place the eggs and butter at room temperature the night before you make the cake.\n" +"Preheat the oven to 350 degree F.\n" +"Measure and keep ready the flour, sugar and the flavorings.\n" +":- To make the caramel, use a white enameled pot, if you have one. The light surface will help to see exactly the caramelizing process. If you don¦t have one, use a medium saucepan.\n" +"Place 1 cup of sugar in the saucepan and add 2 tbsp of water.\n" +"Turn the stove to high and place the pan on the stove and let it boil.\n" +":- Don¦t stir the contents at all. As sugar melts and caramelizes, you may swirl the pan a bit once or twice.\n" +
                "Within 7 - 10 mins, a cherry wood colored caramel forms.\n" +"Immediately, remove the pan from the stove and very carefully add 1 cup of water to the caramel.\n" +":- You may hold the pan above the sink and slowly add the water, for it may splash.\n" +"Stir the contents well to dissolve the caramel. Keep this aside.\n" +"Sift flour and baking powder, a couple of times and keep ready.\n" +"In a large container, whisk butter first and then add 4 cups of sugar and whisk again, until it is creamy.\n" +"Add eggs and whisk well.\n" +"Pour in the caramel syrup, the flavoring powders, salt and vanilla extract and mix everything together.\n" +"Add the flour-baking powder mix and fold this in with a wooden or plastic spatula or spoon.\n" +"When they are well mixed, add the candied fruits and nuts and mix again.\n" +"Spoon this into a 10 inch non stick loaf pans.\n" +
                "Bake for 1 hour at 350 degree F.\n" +":- You may line the pan with parchment paper or brown paper.\n" +":- Check for doneness by inserting a toothpick in the middle of the pan. If the toothpick comes out clean, the cake is done. If not, bake for another 10 - 15 mins and check again.\n" +"Remove the cake from the oven and place it on a cooling rake.\n" +"Pierce the cake with toothpick, and pour Brandy (about 3-4 tablespoon on each) on top and let it soak.\n" +":- This will enhance the flavor and gives a longer shelf life.\n" +"Remove the cake from the pan only after it is allowed to cool completely.\n" +"Before storing, cover the cake completely with wax paper first and then with aluminum foil and keep in the refrigerator.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chocolate Ice Cream");
        cv.put(DESCRIPTION,"Creamy & Delicious Dessert..");
        cv.put(INGREDIENTS,"Dark chocolate : 1 cup\n" +"Fresh cream : ½ cup\n" +"Milk : 2 cups\n" +"Vanilla essence : few drops [optional]");
        cv.put(PROCEDURE,"Take half cup milk in a pan add chocolate and simmer, stirring till smooth. Remove and cool completely.\n" +"Add sugar fresh cream, and remaining milk mix well.\n" +"Transfer in to the container cover and freeze till set. Scoop and serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Citrus n Sweet Fruit Salad");
        cv.put(DESCRIPTION,"Citrus n sweet fruit salad..");
        cv.put(INGREDIENTS,"Pomegranate - 2 nos (1 is also fine)\n" +"Banana - if big 1 or else 2 nos\n" + "Apple - 1/2 of one\n" +"Sugar - 3 tbsp\n" +"Lemon - 1/2 of one");
        cv.put(PROCEDURE,"Open up a pomegranate and separate its red juicy seeds to a vessel.\n" +":- If you are using 1 pomegranate , for now only separate 1/2 a pomegranate.\n" +"Using your hand, squeeze these seeds in the vessel to take in their juice.\n" +":- Do not use a blender. Also do not remove the inside white seeds.\n" +"When done, separate the other pomegranate (if u r using only 1 pomegranate then add the other 1/2) into the vessel.\n" +"Add the sugar and mix it well with a spoon so as to dissolve the sugar.\n" +"Chop the bananas to small square or rectangle shape and add it to the mixture too.\n" +"Chop the apple to small square or rectangle shapes and add it to the mixture.\n" +"Mix the mixture so well that all the fruits are well mixed.\n" +"Add the lemon juice (by squeezing it and removing the seeds) and mix well again.\n" +"Refrigerate it for more taste... but its optional.\n" +
                ":- Serve with loads of love.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Creamy Fruit Salad");
        cv.put(DESCRIPTION,"Creamy & yummy Fruit Salad with icecream..");
        cv.put(INGREDIENTS,"Fruits:-\n" +"Apple\n" +"Grapes\n" +"Cherries\n" +"Banana\n" +"Cream - 1 tin or 170 gm\n" +"Condensed Milk - 1 tin or 397 gm\n" +"Icecream - flavour of your choice");
        cv.put(PROCEDURE,"Peel apple and cut into very small pieces, preferably squares. For grapes, if large then slice it half.\n" +"Mix NESTLE cream and condensed milk together nicely and add all the fruits to it.\n" +"Refrigerate it.\n" +":- Serve chilled with icecream topped\n" +":- Its simple, easy and time saving. If guests are arriving in less time then you can simply try this fruit salad.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Falooda");
        cv.put(DESCRIPTION,"Cool Dessert..");
        cv.put(INGREDIENTS,"chia seeds 2 sp\n" +"dry nuts 4 sp\n" +"rice sevai 2 sp\n" +"rose essence 1 sp\n" +"jelly 2 sp\n" +"ice creams 1 scoop\n" +"chilled milk 1/2 cup");
        cv.put(PROCEDURE,"immerse chia seeds in water for 5 mins\n" +"take a glass first put 2 sp of chia seeds\n" +"add crushed nuts to it.\n" +"add rose essence or rosafsa\n" +"add rice sevai to it\n" +"add jelly\n" +"add ice cream to it\n" +"now slowly add chilled milk again add some nuts , chia seeds and serve\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Fruity Sundae");
        cv.put(DESCRIPTION,"Tasty dessert which takes only 5 mins to prepare..");
        cv.put(INGREDIENTS,"*3 different flavoured ice-cream - 1 scoop each of 3 chosen ones(vanilla/strawberry/mango/chocolate)\n" +"Chopped fruit (Orange/Apple)\n" +"Chopped nuts(Almond/Cashew nuts/ Peanuts)\n" +"Sweet sauce(Coffee sauce/ Chocolate sauce)\n" +"Finely dried cherry\n" +"*Wherever I put slashes (/) in the ingredients\n" +"you just need to choose one. In the first ingredient\n" +"you must choose three you must only put one scoop for each of the three ice-creams you choose.");
        cv.put(PROCEDURE,"Put the 3 scoops of 3 different ice-cream into a long and thin glass.\n" +"Add 6 - 7 chopped fruit.\n" +"Squeeze chocolate sauce on the mixture of fruit and ice-cream.\n" +"Sprinkle some finely chopped nuts on it.\n" +"Top it with a cherry.\n" +":- Serve it after lunch or dinner.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Yoghurt Ice Cream");
        cv.put(DESCRIPTION,"Raspberries with other ingredients..");
        cv.put(INGREDIENTS,"Raspberries - 300g(frozen)\n" +"Natural yoghurt - 1/2 litre\n" +"Lemon juice - 1 tbsp\n" +"Icing sugar - 50g\n");
        cv.put(PROCEDURE,"For preparing yoghurt ice-cream, blend the frozen raspberries.\n" +"Add in yoghurt, lemon juice and icing sugar till smooth.\n" +"Pour it into serving dishes.\n" +"Yoghurt ice-cream is ready. Serve immediately.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ada Pradhaman");
        cv.put(DESCRIPTION,"Yummy Ada..");
        cv.put(INGREDIENTS,"Ada - 1 packet\n" +"Milk - 1 1/2 litre\n" +"Sugar - 1 cup(or as needed)\n" +"Salt - A pinch\n" +"Cardamom powder(Elakka) - 1/2 tsp\n" +"Cashewnuts - 10 nos\n" +"Raisins (Unakka munthiri) - 15 nos\n" +"Condensed milk - A small can\n" +"Ghee - 1 tsp");
        cv.put(PROCEDURE,"Wash ada with cold water.\n" +"Boil milk in a vessel and add ada. Let it cook, then add more milk, sugar, a pinch of salt and cardamom powder.\n" + "Add condensed milk and let it boil.\n" +"Heat ghee in a kadai and fry cashew nuts and raisins. Add this to the payasam.\n" +"Ada pradhaman is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ambalappuzha Palpayasam");
        cv.put(DESCRIPTION,"Enjoy Ambalappuzha Palpayasam, a favorite with all especially kids...");
        cv.put(INGREDIENTS,"Milk - 4 glasses\n" +"Sugar - 1 glass\n" +"Rice(preferably Chemba Pachari) - A handful ");
        cv.put(PROCEDURE,"Wash and dry the rice thoroughly.\n" +"Put all the contents together in a pressure cooker, close the lid without weight on and put on high flame.\n" +"Wait till steam comes, then put on the weight and simmer the flame.\n" +"Simmer it for sharp 30 minutes.\n" +":- You dont have to worry about the number of whistles.\n" +"Switch off the gas after 30 minutes and wait for the pressure to relieve, which might take some time.\n" +":- Delicious palpayasam is ready to be served.\n" +":- This payasam does not need any garnishing with nuts or cardamom and tastes best when chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aravana Payasam");
        cv.put(DESCRIPTION,"Katta Neyy Payasam or Kadum Payasam..");
        cv.put(INGREDIENTS,"Rice - 2 cups\n" +"(crushed red rice would taste better - champa pachari or any white rice if available)\n" +"Water to cook rice\n" +"Ghee - 1 cup\n" +"Jaggery (Sharkkara) - 4 cups\n" +"Cardamom (Elakka) - 1 tsp\n" + "Raisins (Onakka munthiri) - 1 small packet\n" + "Cashews - 10 - 20 nos\n");
        cv.put(PROCEDURE,"Wash rice thoroughly in water and strain properly.\n" +"Fry the rice in 4 tsp of ghee so that the rice gets the ghee smell.\n" +"Cook the rice by adding water appropriately and make sure it is not over cooked.\n" +"Add half cup of ghee to the rice now and blend the rice and ghee on a low flame.\n" +":- Slow cooking makes this payasam very tasty.\n" +"Add jaggery to this rice and cook for some more time, making sure that rice is not over cooked.\n" +"Add the rest of the ghee slowly to this, blending so well, on low flame so that the rice, jaggery and ghee blends together and the ghee starts coming out from the sides of the pan.\n" + "Garnish with raisins and cashews.\n" +"Try this recipe and I am sure everybody will enjoy this !!!!!!!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aravanai");
        cv.put(DESCRIPTION,"Aravanai..");
        cv.put(INGREDIENTS,"Rawrice - ½ cup\n" +"Greengram (Cheruparippu) - ½ cup\n" +"Ghee - ½ cup\n" +"Jaggery (Sharkkara) - 3 cups\n" +"Copra pieces - ¼ cup\n" +"Cashews(chopped) - ¼ cup\n" +"Raisins (Onakka munthiri) - ¼ cup\n" +"Sugar candy(Kalkandam) - ¼ cup\n" +"Grated coconut - ½ cup");
        cv.put(PROCEDURE,"Lightly roast green gram, till a nice aroma comes and the colour changes.\n" +"Wash rice and dal together.\n" +"Heat up a pressure pan.\n" +"Add rice and dal along with 2 cups of water.\n" + "Close the cooker, keep the weight and cook upto 2 whistles.\n" +"Allow it to cool.\n" +"Add 1/2 cup of water to jaggery and heat on a low flame, stirring continuously, till the jaggery dissolves completely.\n" +"Strain and add to the rice-dal mixture.\n" +"Cook, adding ghee little by little.\n" +"Add the copra fried in ghee.\n" +"When the whole mixture becomes a mass, add cashew and raisins fried in little ghee.\n" +"Remove from flame.\n" +"Add sugarcandy and freshly grated coconut.\n" +":- It can be made only with rice without adding dal.\n" +":- You can cook the mixture for just one whistle and if thus made, rice will be slightly grainy.\n" +
                ":- You can add 1 cup of ghee and 4 cups of jaggery.\n" +":- You can omit coconut and sugarcandy.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aval Payasam");
        cv.put(DESCRIPTION,"Beaten rice/Aval cooked with milk ..");
        cv.put(INGREDIENTS,"Aval/Beaten rice - 1 cup\n" +"Sugar - 1/2 cup\n" +"Milk - 2 cups\n" +"Cashewnuts - 1/4 cup\n" +"Raisins - 1/4 cup\n" +"Cardamoms - 6 nos\n" +"Ghee - 1 tbsp\n" +"Milk - 1/2 cup(at room temperature)\n" +"Water - 2 cups");
        cv.put(PROCEDURE,"Heat a tbsp of ghee in a vessel and fry cashew and raisins in it.\n" +"Remove cashews and raisins from the ghee and keep aside.\n" +"In the same vessel with the remaining ghee, fry the aval/beaten rice till it turns reddish brown in color.\n" + "Remove aval from the vessel and keep aside.\n" +"Boil milk in a heavy bottomed vessel and add the fried aval, stirring occasionally until well cooked.\n" +"Now add sugar and keep stirring till the sugar is completely dissolved payasam becomes semi thick.\n" +"Once the desired consistency is reached, add the fried cashews, raisins, and cardamom powder. Stir thoroughly.\n" +"Remove from fire and add 1/2 cup of room-temperature milk.\n" +"Aval payasam is ready and serve hot.\n" +"Happy cooking :)\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Chakara Pongal");
        cv.put(DESCRIPTION,"Sweet Pongal..");
        cv.put(INGREDIENTS,"Rice - 1 cup\n" +"Greengram (Cheruparippu) - 1/4 cup\n" +"Jaggery (Sharkkara) - 1 1/2 cup\n" +"Milk - 2 cups\n" +"Ghee - 1/2 cup\n" +"Cloves (Grambu) - 4 nos\n" +"Nutmeg (Jathikka) powder - 1 tsp\n" +"Cashews - 1/4 cup\n" +"Raisins (Onakka munthiri) -1/4 cup\n" +"Cardamom (Elakka) - 4 nos\n" +"Edible camphor(Pacha karpooram)(optional)");
        cv.put(PROCEDURE,"Fry the rice and the green gram(moong dhal) in a pan, till the colour of the dhal starts to change.\n" +"Cook rice, dhal and milk along with 3 cups of water, till the rice gets cooked.\n" +"Melt jaggery, by boiling it in a little water.\n" + "Mix the melted jaggery with the cooked rice.\n" +"Add ghee and keep stirring, until everything blends well.\n" +"Fry cashews, raisins and cloves in little ghee and add this to the above.\n" +"Pound cardamoms, edible camphor and nutmeg and add this to the pongal.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Elaneer Payasam");
        cv.put(DESCRIPTION,"Elaneer Payasam an easy to make payasam with Tender coconut or Elaneer..");
        cv.put(INGREDIENTS,"Tender coconut(large) - 2 nos\n" +"(should give you about 3 cups of coconut water approx plus coconut cream)\n" +"Condensed milk - 1/2 tin\n" +"Milk - 1 cup");
        cv.put(PROCEDURE,"Take the coconut water and the cream and put it in a blender.\n" +"Run it for just 10 - 20 secs.\n" +"Transfer this into a bowl.\n" +"Add condensed milk and mix well.\n" + ":- You may add more or less according to the sweetness required.\n" +"Add milk and mix well.\n" +":- This Elaneer payasam will be more watery than the regular payasam.\n" + ":- Serve Elaneer Payasam chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Godhambu Payasam");
        cv.put(DESCRIPTION,"Godhambu(Wheat) payasam..");
        cv.put(INGREDIENTS,"Brokenwheat (Godhambu rava) - 250 gm\n" +"Coconut - 2 nos\n" +"Jaggery (Sharkkara) - 500 gm\n" +"Raisins (Onakka munthiri) - 10 gm\n" +"Cashewnuts - 10 gm\n" +"Ghee - 3 tsp\n" +"Cardamom (Elakka) powder - 5 gm\n" + "Dry ginger powder - 10 gm\n" + "Cumin(Jeerakam) powder - 10 gm");
        cv.put(PROCEDURE,"Grate the cocounts and squeeze them to extract 1/2 glass of first milk followed by 1 1/2 glass of second milk and 1 1/2 glass of third milk.\n" +"Fry broken wheat lightly in one tsp of ghee.\n" +"Cook the wheat and bring it to a boil.\n" +"When it thickens to a semi solid consistency, add powdered jaggery.\n" +"Add the second and third milk and boil.\n" + "Add the first milk and add fried nuts, raisins, powdered cardamom, ginger and cumin.\n" + "Mix well and remove from fire immediately.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Junnu(Low Fat Version)");
        cv.put(DESCRIPTION,"Junnu with lowfat milk powder..");
        cv.put(INGREDIENTS,"Water - 1/2 cup\n" +"Non-fat dry milk powder - 1 1/4 cup\n" +"Sugar/jaggery powder - 3/4 cup\n" +"Egg - 2 or 3 Nos\n" +"Milk - 3cups\n" +"PepperPowder - 1tsp\n" + "Cardamom powder - 1tsp");
        cv.put(PROCEDURE,"Mix water with nonfat dry milk powder.\n" +"Microwave it for 30 seconds to 40 seconds.\n" +"Add powdered jaggery or sugar to the above,and stir well until dissolved.\n" +"Cool it and keep aside.\n" +"Beat two eggs well in a bowl.\n" +"Add milk,and the product of step 1,pepper powder,cardamom powder and mix well.\n" +"Take the entire mixture into a steel container and steam cook it covered with a lid on medium heat for an hour in a pressure cooker without whistle\n" +"(.i.e., pour 2cups of water in the pressure cooker,place this steel bowl with lid in the pressure cooker and close the cooker lid and cook on medium flame for 1hour.)\n" +"After 2-3 minutes open the lid.\n" +"(If u find the same is still watery consistency,steam cook for some more time until done.)\n" +"Ready to serve or refrigerate for overnight and serve chillied.\n" +
                "Note:- Please cook it on medium flame only..or else the egg will break and the junnu will be like crumbled texture..\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"American Style Mango pie");
        cv.put(DESCRIPTION,"Soft and tasty mango pie..");
        cv.put(INGREDIENTS,"Graham Cracker pie crusts - 3 nos\n" +"(easily available in all stores)\n" +"Mango pulp - 1 container\n" +"Cream cheese - 8 oz\n" +"Sour cream - 16 oz\n" +"Getatine(unflavoured) - 3 small sized packets\n" +"Sugar - if extra sugar needs to be added and/or if the mango pulp is unsweetened");
        cv.put(PROCEDURE,"In 3 cups of boiling water, add 3 packets of gelatine and stir in, until disolved.\n" +"In a large vessel, pour an entire can of mango pulp, sour cream, cream cheese and fold it into the pulp.\n" +"Once it is well blended, add getatine mixture.\n" +"Add sugar, if necessary.\n" +"Pour this mixture into the pie crusts and refrigerate (do not freeze) for 3 - 4 hours or until firm.\n" +"Slice and serve.\n" +":- This recipe is for 3 pies. So if you intend on making just one pie, divide the recipe ingredients by 3.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Tart");
        cv.put(DESCRIPTION,"Apple with other ingredients..");
        cv.put(INGREDIENTS,"Short bread pastry - As reqd\n" +"Apples - 700g\n" +"Lemon - 1 no\n" +"Sugar - 2 tbsp(powdered and sifted)\n" +"Orange peel - 1 no(grated )");
        cv.put(PROCEDURE,"For preparing apple tart, prepare the short crust pastry.\n" +"Preheat the oven to 200 degrees celsius.\n" +"Then roll out the dough like a chappathi, so that it overlaps on the edges of the pie tray\n" +"Prick the base and pinch down the edges with a fork and leave it to cool in the fridge for 10 minutes.\n" +"Bake it for 10 minutes.\n" +"Quarter, peel and core the apples. Slice it.\n" + "Coat it with lemon juice to stop it from becoming brown.\n" + "Remove the pastry from the oven and fill it with 1 layer of apple slices.\n" + "Sprinkle grated orange peel over it.\n" + "Arrange the rest of the apples over it.\n" + "Sprinkle with powdered sugar and return the tart to the oven for 30 minutes.\n" + "Apple tart is ready. Serve it warm or cold with cream.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Pie");
        cv.put(DESCRIPTION,"A tasty dessert..");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 270g(sieved)\n" +"Egg white - 1 no(beaten)\n" +"Butter - 60g\n" +"Water - 3 -4 tsp\n" +"Lemon juice - 4 tsp\n" +"Salt - As reqd\n" +"Apple - 4 nos(peeled & cored thinly)");
        cv.put(PROCEDURE,"For preparing easy apple pie, add butter to the maida & rub till the mixture resembles bread crumbs.\n" +"Add water & knead to a stiff dough.\n" +"Divide the dough into 4 equal portions. Roll out two portions & place on a pie tray after brushing with a little egg white.\n" +"Sprinkle sugar & lemon juice on the apple pieces. Roll out the other two portions of dough as well.\n" +"Spread the apple mixture onto rolled out portions & cover with the other two portions.\n" +"Press the edges firmly & brush with the left over egg white. Bake in a moderately hot oven for 15-20 minutes. Serve hot or cold.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mango Pie");
        cv.put(DESCRIPTION,"Soft and tasty mango pie..");
        cv.put(INGREDIENTS,"Graham Cracker pie crusts - 3 nos\n" +"(easily available in all stores)\n" +"Mango pulp - 1 container\n" +"Cream cheese - 8 oz\n" +"Sour cream - 16 oz\n" +"Getatine(unflavoured) - 3 small sized packets\n" +"Sugar - if extra sugar needs to be added and/or if the mango pulp is unsweetened");
        cv.put(PROCEDURE,"In 3 cups of boiling water, add 3 packets of gelatine and stir in, until disolved.\n" +"In a large vessel, pour an entire can of mango pulp, sour cream, cream cheese and fold it into the pulp.\n" +"Once it is well blended, add getatine mixture.\n" +"Add sugar, if necessary.\n" +"Pour this mixture into the pie crusts and refrigerate (do not freeze) for 3 - 4 hours or until firm.\n" +"Slice and serve.\n" + ":- This recipe is for 3 pies. So if you intend on making just one pie, divide the recipe ingredients by 3.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Rasmalai");
        cv.put(DESCRIPTION,"Kids favorite dessert with soft bites and crunchy bites..");
        cv.put(INGREDIENTS,"Whole milk - 8 cups\n" +"Lemon juice - 1/4 cup\n" +"Half and Half - 4 cups\n" +"Sugar - 3 cups\n" +"Cardamom (Elakka) powder - A pinch\n" +"Cheese cloth\n" +"Colander");
        cv.put(PROCEDURE,"Boil the whole milk in a pan.\n" +"Once the milk comes to a rolling boil, slowly add the lemon juice to it.\n" +":- You will see the milk start curdling up.\n" +"Once all the milk gets curdled and liquid appears as a light green color, turn the heat off.\n" +"Drain the curds to a colander lined with cheese cloth.\n" +"Tie the cloth from corners and place a weight on top and leave for 30 minutes.\n" +"After 30 minutes, place the paneer onto a dish and add 1 tsp sugar.\n" +"Knead the paneer well until it becomes soft and make lemon size balls out of it.\n" +"Press the balls little bit and make into a flat shape.\n" +"Meanwhile, boil 5 cups of water and add 1 cup of sugar.\n" +"Keep a 1/4 cup for later use.\n" +"Add the paneer balls and cook for 10 minutes until it becomes double in size.\n" +
                "Once they become double, place it onto a dish with the sugar syrup saved and allow to cool.\n" +"Once cooled, press little bit to drain excess syrup.\n" +"Boil half and half in a pan and add 2 cups of sugar.\n" +"Once it reaches boil, add the paneer balls into it along with the cardamom powder.\n" +"Turn off heat and allow to cool.\n" +"Place in a refrigerator and serve chilled.\n" +":- If you want, add some sliced almonds as a garnish.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Bread Butter Pudding");
        cv.put(DESCRIPTION,"Pudding made with apples, bread and butter..");
        cv.put(INGREDIENTS,"Bread slices - 8-12 nos\n" +"(wiith sides cut)\n" +"Apple (medium) - 2 nos\n" +"(sliced into fine pieces)\n" +"Butter - 250 gm\n" +"Milk - 1 cup\n" +"Sugar - 250 gm\n" +"Allpurposeflour (Maida) - 100 gm\n" +"Eggs - 1 - 2 nos\n" +"Coconut (grated) - 4 tsp\n" +"Chocalate chips for garnishing(optional)");
        cv.put(PROCEDURE,"Take sliced apples and 6 tsp sugar along with 1/2 cup of water and heat it over medium heat, till the apples are soft to make a pulp. Keep it aside.\n" +"Take a buttered baking pan. Butter the breads on both sides and place on the pan in a layer.\n" +"Pour the apple pulp over it as another layer.\n" +"Make as many layers with bread and apple pulp, alternatively to the thickness desired.\n" +"Mix together milk, 4 tsp of sugar and eggs well and pour over the top of the prepared layers and keep for 30 minutes.\n" +"Mix the grated coconut and maida along with 3 tsp of sugar and sprinkle on top.\n" +"Sprinkle chocalate chips on top.\n" +"Bake it for 35-45 minutes in 350-400 degrees farenheits\n" +":- Serve cold.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Baked Fruit Pudding");
        cv.put(DESCRIPTION,"Mixed fruits, custard powder and other ingredients are added and baked..");
        cv.put(INGREDIENTS,"Banana`s - 3 nos(peeled and chopped in slices)\n" +"Dates - 1/2 cup(chopped)\n" +"Black grapes - 1/2 cup\n" +"Green apple`s - 1 cup(chopped)\n" +"Orange juice - 1/2 cup\n" +"Sugar - 1 tsp(powdered)\n" +"Custard Powder - 1 tbsp\n" +"Fresh cream - 1/2 cup\n" +"Butter - As reqd\n" +"Flaked almonds - 1/2 cup(roasted)\n" +"Ground nuts - 1 tbsp(roasted)");
        cv.put(PROCEDURE,"For preparing baked fruit pudding, take custard powder in a bowl. Add powdered sugar, fresh cream and orange juice. Mix well to avoid lumps. Keep it aside.\n" +"Grease a baking tray with a little butter.\n" +"Layer the baking tray with chopped banana`s, dates, black grapes and apple`s.\n" +"Pour the custard mixture over the fruits.\n" +"Spread flaked almonds and groundnuts over it.\n" +"Bake it in an oven mark 130, till it is cooked.\n" +"Once it is cooked remove it from the oven and allow it to cool completely.\n" +"Refrigerate the pudding.\n" +"Baked fruit pudding is ready. Serve cold with jam.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Biscuit & Coffee Pudding");
        cv.put(DESCRIPTION,"Very easy and delicious pudding..");
        cv.put(INGREDIENTS,"Whipping cream - 2 cups\n" +"Condensed milk - 3/4 of a tin\n" +"Unsalted biscuits(crackers) - 1/2 a packet\n" +"Crushed nuts(Almonds or Walnuts)\n" +"Powdered sugar - 1/4 cup\n" +"Cocoa powder - 1 tsp\n" +"Instant coffee powder - 1 tsp\n" +"Butter - 100 gm\n" +"Egg - 1 no\n" +"Caramalised nuts for garnishing\n" +"Gelatine - 1 envelope\n" +"(melted in hot water)");
        cv.put(PROCEDURE,"Place butter and egg into a blender and blend it well for about 3 minuteS.\n" +"Add whipping cream, condensed milk, crushed biscuits, crushed nuts, sugar, coffee and coco powder(diluted with 1 tbsp warm water) and gelatine mixture into the blender and blend again for about 5 minutes.\n" +"Take a setting tray and pour this mixture into it.\n" +"Leave it in the refrigerater to set for about 10 - 12 hrs.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Biscuit Pudding");
        cv.put(DESCRIPTION,"A pudding with Marie Biscuits..");
        cv.put(INGREDIENTS,"Marie Biscuits - 1 pkt\n" +"Nestle condensed milk - A small tin\n" +"Nestle cream - 2 small tins\n" +"Dream whip - 4 tbsp\n" +"Coffeepowder - 1 tsp\n" +"Pista nuts - 1 cup\n" +"Water - 1 cup\n");
        cv.put(PROCEDURE,"Place condensed milk, nestle cream, dream whip, 1/2 tsp coffee powder in a blender and blend it well for about 10 mins.\n" +"Heat a little water and add the remaining coffee powder to it.\n" +"Take a setting bowl in which a layer of biscuits dipped in the warm water is placed.\n" +"Pour a little of the blended mixture on top of this.\n" +"Form another layer of biscuits and pour the mixture again.\n" +"Repeat the procedure until all the biscuits are over.\n" +"Keep aside for 15 mins.\n" +"Mix the pudding with a spoon until all the ingredients are uniformly distributed.\n" +":- The pudding should not become a paste.\n" +"For garnishing, you may use other nuts like peanuts, pistachios or raisins.\n" +"Leave it in the refrigerator to set.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bread Cream Pudding");
        cv.put(DESCRIPTION,"Very tasty dessert for all occasion..");
        cv.put(INGREDIENTS,"Bread slices - 8 nos\n" +"(remove the sides and cut into square pieces)\n" +"Milk - 1/2 cup\n" +"Sugar - 4 tbsp\n" +"Condensed milk - 1 tin\n" +"Cream - 2 tin\n" +"Whipping cream - 4 sachets\n" +"(any whipping cream powder)\n" +"For garnishing:-\n" +"Sugar\n" +"Cashewnuts\n");
        cv.put(PROCEDURE,"Beat together condensed milk, cream and whipping cream till you get a soft and fluffy cream.\n" +"For garnishing, caramalise sugar. Add the nuts to it. Pour the syrup into a greased tray. Crush it and keep aside.\n" +"Boil milk with sugar.\n" +"In a serving glass tray, spread bread dipped in milk as a layer.\n" +"As a second layer, spread the beaten cream and put the caramalized nuts.\n" +"Repeat the same to make one more layer.\n" +"Garnish with the caramalized nuts.\n" +"Refrigerate and serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Caramel Custard");
        cv.put(DESCRIPTION,"Baked custard..");
        cv.put(INGREDIENTS,"Eggs - 2 nos\n" +"Egg yolks - 2 nos\n" +"Castor sugar - 3 tbsp\n" +"Vanilla essence - As reqd\n" +"Water - 1/2 cup\n" +"Milk - 1/2 litre\n" +"For caramel:\n" +"Castor sugar - 1 cup\n" +"Water - 1/2 cup");
        cv.put(PROCEDURE,"For preparing caramel custard, take sugar and water in a pan and boil until deep golden brown in colour.\n" +"Pour the caramel into the serving bowl and coat the sides evenly.\n" +"In another vessel whisk eggs, egg yolks, castor sugar and vanilla essence. Pour the milk and whisk it again.\n" +"Strain it to the caramel lined bowl.\n" +"Place the bowl in a baking dish filled with hot water half-way.\n" +"Bake at 160 degree centigrade for 45 min.\n" +"Remove the custard from the baking dish and refrigerate overnight.\n" +"Transfer the caramel custard to a serving plate carefully before serving.\n" +"Caramel custard is ready. Serve cold.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Caramel Pudding");
        cv.put(DESCRIPTION,"Sweet Dish..");
        cv.put(INGREDIENTS,"For custard:-\n" +"Milk - 1 litre\n" +"Eggs - 5 nos\n" +"Sugar - 7 - 8 tbsp\n" +"For caramel:-\n" +"Sugar - 7 - 8 tbsp\n" +"Water - 200 ml");
        cv.put(PROCEDURE,"Grease a shallow vessel( similar to a jelly mould ) with little butter or vanaspati. Set aside.\n" +"In another container, beat the eggs one by one, by adding vanilla essence to it. Add milk and sugar too and mix properly.\n" +"To prepare the caramel, put the sugar in a heavybased saucepan and heat. When it gets melted properly and becomes brownish (see to that it is not getting burnt ) pour water and stir it continously. When it reaches a medium consistency, switch off the stove.\n" +"Pour this caramel to the greased vessel and now pour the custard mix carefully. Do not blend too much with the caramel.\n" +"To cook as double boiling:\n" +"Take a vessel ( this should be of double the size of the custard bowl ) with half of water in it and place the caramel custard mix bowl into this by closing it with a firm lid.\n" +
                "Now close the big vessel too and cook for 30 minutes or until the custard is cooked properly.\n" +":-You can ensure this by inserting a skewer on to it and the skewer should come out almost clean.\n" +":-Refrigerate it and serve with little of caramel sauce.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Double Ka Meeta");
        cv.put(DESCRIPTION,"Delicious sweet made from bread..");
        cv.put(INGREDIENTS,"Bread - 1 pound\n" +"Milk - 1 ltr\n" +"Sugar - 500gms\n" +"Cashewnuts - few\n" +"(chopped)\n" +"Almonds - few\n" +"(chopped)\n" +"Raisins - few\n" +"Saffron - a pinch\n" + "Butter - 1 small cup\n" +"Cardamom - 2\n" +"(powdered)\n" +"water - 1/2 ltr");
        cv.put(PROCEDURE,"first make sugar syrup,adding 1/2 litre of water and 500gms of sugar.\n" +"To this add saffron,cardamom powder.\n" +"Boil milk and keep aside.\n" +"Take a pan,fry bread slices in butter till it turns golden brown color.\n" +"Dip fried slices slightly in boiled milk,and add in the syrup.Continue the same with all the slices.\n" +"Now fry almonds,cashewnuts n raisins in butter and add to the syrup.\n" +"If there is reamins of milk add that to the syrup , refrigerate and serve as a dessert.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Tender Coconut Pudding");
        cv.put(DESCRIPTION,"Pudding made with coconut and condensed milk..");
        cv.put(INGREDIENTS,"Tender cocount pulp - 2 cups\n" +"Condensed Milk - 1 tin\n" +"Fresh milk - 1 cup\n" +"Gelatin - 2 tsp\n" +"Dates (chopped) - for garnishing\n" +"Cashewnuts (chopped) - for garnishing");
        cv.put(PROCEDURE,"Blend all the ingredients with gelatin dissolved in 1/2 cup of hot water.\n" +"Pour in serve cups and refrigerate.\n" +"Garnish with chopped dates and cashew nuts.\n" +":- Serve and enjoy..!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mango Souffle");
        cv.put(DESCRIPTION,"An easy way to make delicious souffle..");
        cv.put(INGREDIENTS,"Mango - 400 gm\n" +"Gelatin - 3 tsp\n" +"Egg white from 2 eggs\n" +"Whipped cream - 3/4 cup\n" +"Powdered sugar - 1 cup\n" +"Mango essence - 1 tsp\n" +"Yellow color - 2 drops");
        cv.put(PROCEDURE,"Blend well the mango and sugar to form a thick paste.\n" +"Double boil the gelatin in 1/4 cup water.\n" +"Add this to the above paste and keep in freezer for 10 mins or until it is set.\n" +"Add whipped cream and blend well.\n" +"Beat the egg white and add.\n" +"Mix slowly using a spoon.\n" +"Add essence and yellow color.\n" +"Keep this in freezer for 1/2 hour.\n" +"Garnish with mango slices and cream.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Pineapple Souffle");
        cv.put(DESCRIPTION,"A delicious dessert with pineapple..");
        cv.put(INGREDIENTS,"Sweet pineapple - 1 small tin\n" +"(cut into very small peices)\n" +"Cream - 1 cup\n" +"Gelatin - 1 tbsp\n" +"Sugar - 6 - 8 tbsp\n" +"Water - 1/4 cup\n");
        cv.put(PROCEDURE,"Mix gelatin with 1/4 cup of warm water and stir, till the gelatin is dissolved.\n" +"Heat half cup of pineapple syrup and sugar.\n" +"When the sugar is dissolved, mix gelatin to it and take it off from the stove immediately.\n" +"Allow it to cool.\n" +"Keep it in the freezer.\n" +"When it is half set, beat it well and pour it in a serving bowl.\n" +"Add cream to it and beat it again for 2 - 3 mins, using a handmixer.\n" +"Add pineapple tit bits and mix well.\n" +"Keep in the freezer, until it sets.\n" +":- You can also make mango souffle with the same recipe using mango slices and puree.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Pista Souffle");
        cv.put(DESCRIPTION,"A delicious dessert..");
        cv.put(INGREDIENTS,"Egg yolks - 2 nos\n" +"Sugar - 25 gm\n" +"Boiled milk- 100 ml\n" +"Gelatin - 2 tsp\n" +"Fresh cream - 200 gm\n" +"Pista ice cream - 70 gm\n" +"Egg whites - 2 nos\n" +"Sugar - As reqd");
        cv.put(PROCEDURE,"Mix together egg yolk, sugar and boiled milk and add the double boiled gelatin.\n" +"Add fresh cream and pista ice cream.\n" +"Beat the egg and sugar together till it becomes fluffy.\n" +"Add it to the above mixture.\n" +"Keep in freezer for 1/2 hr or until it becomes set.\n" +"Garnish with pistachios and cream.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Strawberry Jelly");
        cv.put(DESCRIPTION,"A yummy strawberry jelly with different juices..");
        cv.put(INGREDIENTS,"Strawberries - 450g\n" +"Oranges - 1 kg\n" +"Lemon - 2 nos\n" +"Sugar - 180g\n" +"Jelly tablets - 8 nos");
        cv.put(PROCEDURE,"For preparing strawberry jelly, soak the jelly tablets in cold water.\n" +"Squeeze the oranges and lemons to get 600ml of juice.\n" +"Pour the juices into a saucepan, add in sugar and boil it.\n" +"Remove it from the heat and add in the drained jelly tablets. Whisk them well.\n" +"Puree the strawberries and sieve it.\n" +"Pour in the juice and mix it.\n" +"Allow it to cool and pour it into a tin.\n" +"Leave it to set in the fridge overnight.\n" +"Plunge the tin in hot water before turning the jelly out.\n" +"Strawberry jelly is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Almond Burfi");
        cv.put(DESCRIPTION,"Burfis made with almonds or badam..");
        cv.put(INGREDIENTS,"Almonds(Badam) - 2 cups\n" +"(ground without skin)\n" + "Sugar - 2 cups\n" +"Ghee - 1/2 - 1 cup\n" +"Milk powder- 2 cups\n");
        cv.put(PROCEDURE,"Make sugar syrup of one string consistency.\n" +"Mix ground almonds and milk powder and add to the syrup.\n" +"Stir over low fire adding ghee little at a time.\n" +"When it starts leaving the sides, remove and pour into a greased plate.\n" +"Cut into desired shapes.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ambrossio");
        cv.put(DESCRIPTION,"Dessert..");
        cv.put(INGREDIENTS,"Sour cream - 1 cup\n" +"Whipping cream - 1 cup\n" +"Chopped/Canned Pineapple slices - 1 cup\n" +"Chopped/Canned orange slices - 1 cup\n" +"Small marshmellows - 1 cup\n" +"Seed less grapes - A few\n" +"Sugar - 3/4 cup\n" +"Strawberries - A few\n" +"Jello - A few slices(optional)");
        cv.put(PROCEDURE,"Blend together sour cream and whipping cream with sugar.\n" +"Add all fruits except strawberries to the mix.\n" +":- Make sure to drain water, if using canned fruits.\n" +"Add the marshmellows.\n" +"Keep it for at least 4 hours in the refrigerator.\n" +":- Do not freeze.\n" +"Garnish with sliced strawberries and jello.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Aval Kesari");
        cv.put(DESCRIPTION,"Quick tasty aval with jaggery..");
        cv.put(INGREDIENTS,"Beaten rice flakes(Aval/Poha) - 1 cup\n" +"Jaggery (Sharkkara) - 3/4 cup\n" +"Milk - 1/2 cup\n" +"Grated coconut - 2 - 3 tbsp");
        cv.put(PROCEDURE,"Grind aval coarsely in the mixer.\n" +"Fry it in ghee for 3 - 4 mins until it becomes soft.\n" +"Take another pan and melt jaggery till it becomes liquid.\n" +"Add fried aval, milk and grated coconut to this liquid and mix well.\n" +"Allow it to cool for sometime.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Badam Halwa");
        cv.put(DESCRIPTION,"Home made Almond(Badam) halwa ..");
        cv.put(INGREDIENTS,"Almonds(Badam) - 1 full cup\n" +"Ghee - 4 tbsp\n" +"Sugar - 1 1/2 cups\n" +"Saffron - A few strands(optional)\n" + "Water or Milk ");
        cv.put(PROCEDURE,"Soak the badam in milk or water for 4 hours.\n" + "Peel the badam.\n" +"Grind the badam into a fine paste, adding just enough milk.\n" +"Heat a kadai or a thick bottomed vessel.\n" +"Add the badam paste and the sugar.\n" +":- The sugar will dilute the paste and make it runny.\n" +"Keep stirring for 10 mins on a low-medium flame.\n" +"Add a tbsp of ghee at a time and keep stirring, until ghee is absorbed.\n" +"After 8 mins or until the ghee is fully absorbed, switch off the flame.\n" +"Transfer the contents to a container and mark the shapes.\n" +"Place a single strand of saffron on each of the cut shapes.\n" +":- You can user edible silver wrapper on the halwa instead of saffron.\n" +":- To get yellow color, add the saffron(soaked in milk) to the halwa, while cooking it.\n" +
                ":- You can also add cardamom for additional flavour.\n" +":- Care should be taken to keep on a low-medium flame so as to avoid burning.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Badusha");
        cv.put(DESCRIPTION,"Soft and creamy badushas ..");
        cv.put(INGREDIENTS,"Allpurposeflour (Maida) - 2 cups\n" +"Thick curd/yoghurt - 1 cup\n" +"Ghee - 3/4 cup\n" +"Baking soda(sodium-bi-carb) - 1 tsp\n" +"Lime juice - 1/2 tsp\n" +"Essence(preferably Ross) - A few drops\n" +"Ghee or ghee and oil mix for deep frying\n" +"For syrup:-\n" +"Sugar - 3 cups\n" +"Water - 1 1/2 cups\n" +"For garnishing:-\n" +"Any crushed nuts\n" +"saffron strands");
        cv.put(PROCEDURE,"For preparing badusha recipe, first sieve together baking soda and flour.\n" +"Crush the nuts and keep aside.\n" +"Beat the curd and add little sugar and ghee to make a foaming consistency.\n" +"In a food processor, pour this liquid and add the flour mix and blend for 2 - 3 mins.\n" +":- No need to add water. If needed, add only curd.\n" +"Make it into a spongy dough.\n" +"Make small lemon size balls and roll in between palms hardly\n" +":- The badushas gets smooth & creamy inside, slightly layered.\n" +"Make balls off the whole dough and press to flatten a bit and make depression in center with thumb.\n" +"Cover with a damp cloth and keep it in the fridge for 10 mins.\n" +"Prepare the syrup of 2 string consistency and keep it warm.\n" +"Add Ross essence and lemon juice.\n" +"Take the badushas from the fridge and keep it in the room temperature for 2 mins.\n" +
                "Heat ghee in a pan.\n" +"Put 3 - 4 badushas into it and simmer the flame to medium.\n" +"Let them cook on a low heat to golden brown.\n" +"Remove from ghee when it¦s done and drop it one by one into the syrup.\n" +"Allow it to soak for 12 -15 mins.\n" +"Place them in a wide plate and sprinkle nuts and saffron strings over.\n" +"sieve together baking soda and flour.\n" +"For layered badushas:-\n" +"Take all ingredients as for the above recipe.\n" +"Make the syrup thicker than above.\n" +"When it is boiling, add a tsp milk to it.\n" +":- The dust will float on the surface. Take it out with a spoon.\n" +"Divide the whole dough into 2 parts.\n" +"Roll it out into a big thin roti.\n" +"Apply ghee and rice flour upon it.\n" +"Roll it like a mat and on every turn, apply ghee and rice flour.\n" +"Press a little with the rolling pin.\n" +
                "Cut into 1 1/2\" pieces and take each piece and press to flatten a bit and make depression in center with thumb.\n" +"Heat the ghee in a pan and keep the flame in medium.\n" +"Drop 3 - 4 of them into the hot ghee.\n" +"Deep fry them on a low flame, till they turn golden.\n" +"Dip them in the thick syrup for 8 - 10 mins.\n" +"Place badushas in a wide plate and sprinkle nuts or roasted coconut strings.\n" +":- Check the heat of the ghee time to time. Otherwise, badushas may get burned.\n" +":- If u r using ghee for frying, the taste will be awesome. But you can use ghee and oil mix to reduce your heath problems.\n" +":- Try these out and make your own badushas at home.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Balu Shahi");
        cv.put(DESCRIPTION,"Balu Shahi..");
        cv.put(INGREDIENTS,"For Balu Shahi:\n" +"Allpurposeflour (Maida) - 225 gm\n" +"Ghee - 125 gm\n" +"Warm milk/curd - 2 tbsp\n" +"Bakingpowder - 1 tsp\n" +"Warm water - 1 tsp\n" +"For syrup:\n" +"Sugar - 250 gm\n" +"Water - 2 cups");
        cv.put(PROCEDURE,"Sieve the flour in a mixing bowl and add the heated ghee and baking powder.\n" +"Rub the mixture with your hands , gradually adding milk/curd and warm water and mix into a stiff dough.\n" +"Break off a small portion of the dough into a ball, flatten it and make a deep hole through the center.\n" +"To prepare the syrup, boil the sugar and water together in a large pan for 15 minutes; the syrup should be quite sticky.\n" +"Heat the ghee in a frying pan.\n" +"Fry the balu shahi quite slowly until they are golden brown.\n" +"When they are fully done, put them in the warm syrup for a few minutes, shaking the pan frequently to let them become well-coated with syrup.\n" +"Take them out singly from the pan and place on a shallow dish.\n" +":- Serve cold or hot.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Banana Halwa");
        cv.put(DESCRIPTION,"Delicious and easy Pazham or Nenthrapazham halwa..");
        cv.put(INGREDIENTS,"Ripe bananas - 1/2 kg\n" +"Ghee - 1/2 cup\n" +"Jaggery (Vellam) - 1/2 kg\n" +"Almonds/Badam(chopped) - 1 tbsp\n" +"Cardamom (Elaichi) - 1 pinch\n" +"Almond flakes - 1 tsp");
        cv.put(PROCEDURE,"Peel the bananas and scrape out the black-veined centre.\n" +"Mash the bananas into pulp.\n" +"Warm the ghee in a pan and add the banana pulp.\n" +"Cook, until the mixture turns light brown.\n" +"Add the crushed jaggery. Stir well.\n" +"Add the cardamom powder and the chopped almonds.\n" +"Stir well until the almonds are lightly roasted.\n" +"Garnish with almond flakes.\n" + ":- If you add 1 tsp of fried coconut flakes and 2 cups of coconut milk to this dish and warm it slightly, it can be served as a South Indian sweet called Pazha Paayasam (Banana Pudding)\n" +":- Choose only ripe bananas to make this dish.\n" +":- You may use plantain to make Nenthrapazha halwa, but it needs to be steamed first before being mashed.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bengali Rasgulla");
        cv.put(DESCRIPTION,"Sweet Bengali Rasgulla, The famous Bengali sweet with its history of more than a century has crossed the boundaries of culture. It is one of the recipes prepared on diwali times...");
        cv.put(INGREDIENTS,"Milk - 4 cups\n" +"Lemon juice - 1/2 cup\n" +"Water - 4 cups\n" +"Sugar - 2 cups");
        cv.put(PROCEDURE,"Boil milk in a vessel in high flame.\n" +"When the milk starts to boil, add the lemon juice to it slowly. Stir the mixture until the milk fat(paneer) and the water gets separated.\n" +"Filter the mixture using a clean cloth and drain the water out of the mixture.\n" + "Once the water is drained out, wash the milk fat using some plain water to remove the lemon taste.\n" +"Press and rub the milk fat for around 1-2 minutes to remove the excess water.\n" +"Make 10-12 small balls from the milk fat(paneer).\n" + "Add sugar to 4 cups of plain water and boil in a pressure cooker.\n" +"Once the sugar water mixture starts to boil, add the milk fat balls to it.\n" +"Close the cooker and boil in medium flame for 5-7 minutes (1 steam whistle).\n" +"After 5-7 minutes, open the cooker and transfer the contents (sugar mixture and Rasgulla) into another vessel.\n" +
                "Keep the contents in a refrigerator and allow it to cool.\n" +":- Serve the Rasgulla cold.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Diamond Cuts");
        cv.put(DESCRIPTION,"Crispy flattened sweet treats shaped in diamond shape...");
        cv.put(INGREDIENTS,"AllPurposeflour ( Maida) - 2 cups\n" +"Egg - 1/2 of an egg beaten well\n" +"Water - around 1/4 to 1/2 cup to make a smooth dough\n" +"Salt - 2 pinches.\n" +"Cardamom powder - 1/4 tsp\n" +"(optional)\n" +"Oil - for deep frying.\n" +"Sugar - 1 cup\n" +"Water - 4 tsp");
        cv.put(PROCEDURE,"Mix flour, egg, salt and cardamom powder long with enough water to make a smooth dough.Knead very well to incorporate all the ingredients.\n" +"Cover the dough with a damp cloth and leave in the kitchen counter for around 15-30 mts.\n" +"Dust the kitchen counter with enough flour.\n" +"Divide the dough into equal parts and start working on one ball at a time, meanwhile leaving the other balls under the cloth.\n" +"Flatten the dough ball into a rectangle shape using a rolling pin and cut out equal strands of ribbons.\n" +"Now make slanted cuts in one ribbon voila you got diamond shaped cuts.\n" +"Repeat the steps for rest of the leftover dough balls.\n" +"Heat a wok with enough oil and fry the cuts out (few at a time).\n" +"The cuts will puff up and ends will start browning up.\n" +":- This is the perfect cooking for the cuts.\n" +
                "Drain them in kitchen towel and keep aside.\n" +"Mix water and sugar on a stove top and you get a threadlike consistency.\n" +"Coat the diamond cuts with the sugar syrup and keep them aside for cooling down.\n" +":- You can dip diamond cuts in the syrup and drain them using a slotted spoon.\n" +"\n" +"Once the cuts are cooled, store them in an airtight container.\n" +"Enjoy!!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Gajar Halwa");
        cv.put(DESCRIPTION,"A North Indian sweet dish made of Carrots..");
        cv.put(INGREDIENTS,"Carrots (medium sized) - 4 nos\n" +"Powdered cardamom (Elaichi)- 1 tsp\n" +"Condensed Milk - 1/4 milkmaid\n" +"Whole Milk - 2 Cups\n" +"Sugar - 1/2 Cup\n" +"Ghee - 2 tbsp\n" +"Cashewnuts and Pista (optional) - for garnish");
        cv.put(PROCEDURE,"Grate the carrots.\n" +"Heat the pan and put the 2 tablespoons of ghee into it.\n" +"Add the carrots and saute for 2 minutes.\n" +"Add the condensed milk and keep stirring till the milk blends with the carrots.\n" +"Add the whole milk and keep stirring.\n" +"Add the sugar and the elaichi.\n" +"Keep stirring till the desired consistency is attained.\n" +"Garnish with Cashewnuts and Elaichi.\n" +"Tip:- Keep stirring in 8 shaped manner when adding milk.\n" +":- This may be eaten cold or warm. May be also eaten along with Vanilla/Strawberry icecream.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Soda Punch");
        cv.put(DESCRIPTION,"A refreshing drink made with soda and apples..");
        cv.put(INGREDIENTS,"Ripe apples - 4 - 5 nos\n" +"(cut into small pieces)\n" +"Sugar - 1/2 cup\n" +"Water - 1 cup\n" +"Soda - 1/2 liter(chilled)\n" +"Cinnamon powder/ stick - 1 tsp or 1\" stick\n" +"Salt - A pinch\n");
        cv.put(PROCEDURE,"Cook the chopped apples in 1 cup of water along with cinnamon, covered with lid.\n" +"Once it boils, simmer in low heat for around 15 mins.\n" +"Remove from fire, strain and squeeze the apple pieces to get out the maximum juice.\n" +"Discard the dry Kothu or pulp and cinnamon stick if any.\n" +"While the juice is still warm, add and mix the sugar and stir until completely mixed.\n" +":- If needed, heat it up to melt sugar.\n" +"When sugar has been completely incorporated, add salt and chill the juice.\n" +"Just before serving, mix with the soda and serve in tall glasses.\n" +":- For a change, try adding some pepper powder or black salt(abt 1/8 tsp for 1 glass).\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Apple Spice Drink");
        cv.put(DESCRIPTION,"An apple drink with spices..");
        cv.put(INGREDIENTS,"Orange peel - 3 tsp\n" +"Cinnamon - 3 sticks\n" +"(crushed)\n" +"Whole cloves - 3 tsp\n" +"Whole nutmeg(Jathikka) - 1 no\n" +"(crushed)\n" +"Apple juice - 3 cup\n" +"Cinnamon sticks - 6 nos for garnishing");
        cv.put(PROCEDURE,"Combine orange peel, crushed cinnamon sticks, cloves and nutmeg in a small bowl.\n" +"Tie dry ingredients in a double thickness of cheesecloth to make a sachet or secure in a large tea-straining ball.\n" +"In a medium pan, simmer apple juice with spices for at least 20 mins.\n" +"Ladle into mugs.\n" +"Garnish each with a cinnamon stick.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Carrot Drink");
        cv.put(DESCRIPTION,"Carrot Drink..");
        cv.put(INGREDIENTS,"Carrot (grated) - 1/2 cup\n" +"Water - 3/4 cup\n" +"Honey - 1 1/2 tbsp\n" +"Lemon - 1/2 of one\n" +"Small piece of Ginger/ 3 - 4 mint leaves (optional)");
        cv.put(PROCEDURE,"Grind the grated carrot.\n" +"Strain it.\n" +"Blend it with honey and lemon juice.\n" +"Add ginger or mint leaves (if you like the flavour) when grinding the carrot.\n" +":- The ingredients should be fresh.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Energy Lemonade");
        cv.put(DESCRIPTION,"A quick lemon juice to kickstart the day and also good for your tummy ..");
        cv.put(INGREDIENTS,"Fresh juicy lemon - 2 nos\n" +"Ginger - 1 small piece of about 2 inches\n" +"Sugar - 3 tbsp\n" +"Salt - A pinch\n" +"Water - 200 ml\n" +"Ice cubes - 3 - 4 nos (optional)");
        cv.put(PROCEDURE,"Manually, take the juice from the lemons discarding the seeds.\n" +"Peel the skin off the ginger.\n" +"Put the lemon juice extract, ginger, salt and sugar in a mixer-juicer and run it for 2 mins.\n" +":- If u want it chilled, put some ice cubes too.\n" +"Add water and run it for another 1 min.\n" +"Pour into long crystal glasses.\n" +"Garnish with lemon sections.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Fruit Punch");
        cv.put(DESCRIPTION,"a punch made of fruit juices mixed with water or soda water..");
        cv.put(INGREDIENTS,"Orange juice - 3 qts\n" +"Pineapple juice - 2 qts\n" +"Lemon-lime soda - 2 lt\n" +"Grenadine - 1/2 cup\n" +"Ice - 4 cups\n" +"Orange (medium) - 1 no\n" +"(sliced)\n" +"Lemon(medium) - 1 no\n" +"(sliced)\n" +"Lime(medium) - 1 no\n" +"(sliced)");
        cv.put(PROCEDURE,"Combine juices, soda, and grenadine in a punch bowl.\n" +"Add ice.\n" +"Lay slices of fruit on ice to garnish.\n" +":- Grenadine (grenadine syrup) is a blood-red, strong syrup made from pomegranates.\n" +":- One can get this from store and can also make on your own.\n" +":- Use 4 pomegranates to make about 2 cups of pomegranate syrup. After removing seeds, process with food processor knife blade. Simmer pulp with 1/4 cup honey over low heat 3 minutes. Stir well. Strain to remove seeds.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Grape Juice");
        cv.put(DESCRIPTION,"There's nothing better than homemade grape juice..");
        cv.put(INGREDIENTS,"Grapes(Black ones) - 1 kg\n" +"Sugar - 200 gm\n" +"Cardamom  - 3 nos\n" +"(powdered)\n" +"Cloves - 2 - 3 nos\n" +"Cinnamon - 1 piece");
        cv.put(PROCEDURE,"Boil grapes in 2 1/2 glass of water.\n" +"Keep it overnight.\n" +"Next day, grind it in a mixer or squeeze it with your hands.\n" +"Remove the skin and extract the juice.\n" +"Boil water in a pan.\n" +"Add sugar and make it thick.\n" +"Add cloves, powdered cardamom and cinnamon and mix well.\n" +"Add the juice to it.\n" +"Allow it to cool.\n" +"Keep in refrigerator.\n" +":- Serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Health Drink");
        cv.put(DESCRIPTION,"for good health and stamina..");
        cv.put(INGREDIENTS,"Ginger - 3\" piece\n" +"Black pepper powder - 2 tbsp\n" +"Tender neem leaves - A fistful\n" +"Bitterguard pieces - 1/2 of one\n" +"(with out seeds)\n" +"Tulsi leaves - A fistful\n" +"Dry ginger powder - 1 tsp\n" +"Crystal sugar - 50 gm\n" +"Honey - 2 tbsp");
        cv.put(PROCEDURE,"Take 300 ml of water.\n" +"Put all the ingredients into it except honey.\n" +"Boil until the quantity reduced to half.\n" +"Filter and add honey to the filtrate and take in the early morning, preferably after exercise.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mango Delite");
        cv.put(DESCRIPTION,"Cool drink for parties and get-togethers..");
        cv.put(INGREDIENTS,"Mango pulp - 1 can\n" +"Sprite - 1 litre bottle");
        cv.put(PROCEDURE,"Mix together the mango pulp and sprite in 1:3 measure in a jug.\n" +":- For every 1 cup of mango pulp, add 3 cups of sprite.\n" +"Stir before serving(mango pulp settles at bottom).\n" +":- Serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Sambhaaram");
        cv.put(DESCRIPTION,"Flavoured Buttermilk(Moru) with spices..");
        cv.put(INGREDIENTS,"Buttermilk(Moru) - 4 cups\n" +"(Blend homemade yoghurt and water. The readymade ones won`t be good for this)\n" +"Greenchillies - 2 nos\n" +"Ginger - A small piece\n" +"Lemon leaf - 1 no(optional)\n" + "Curryleaves - A few\n" +"Salt - As reqd\n" +"Mint leaf(Pudhina) or Coriander leaf for garnishing");
        cv.put(PROCEDURE,"Blend all the ingredients in a blender.\n" +"Pour into a a tall glass with some ice.\n" +"Garnish with a sprig of mint or coriander.\n" +":- Serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Badam Milk");
        cv.put(DESCRIPTION,"Almond(Badam) milk..");
        cv.put(INGREDIENTS,"Milk - 5 cups\n" +"Almonds(Badam) - 1/2 cup\n" +"Cashewnuts (chopped) - 2 tbsp\n" +"Sugar - 1/2 cup\n" +"Rose essence - 2 drops\n" +"Saffron - A pinch");
        cv.put(PROCEDURE,"Boil the almonds in a pan for 5 minutes. Remove and drain.\n" +"Peel the skin off the almonds and grind in a blender to a smooth paste. Keep it aside.\n" +"Dissolve the saffron in 2 tbsp of warm milk and keep it aside too.\n" +"Boil the milk in a pan.\n" +"Add the almond paste and mix thoroughly.\n" +"Simmer the milk over a low flame for 3 minutes.\n" +"Remove from the flame and strain the milk.\n" +"Allow the milk to cool.\n" +"Add the dissolved saffron and the rose essence and mix thoroughly.\n" +"Sprinkle the chopped cashew nuts on top of the milk.\n" +":- Serve warm.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Carrot Banana Delight");
        cv.put(DESCRIPTION,"A cool shake for a hot day with carrots, banana and milk..");
        cv.put(INGREDIENTS,"Carrot (big) - 1 no\n" +"Banana (big) - 1 no\n" +"Almonds(Badam) - 12 nos\n" +"Cashewnuts - 12 nos\n" +"Milk - 1 1/2 cups\n" +"Sugar - As reqd");
        cv.put(PROCEDURE,"Wash the carrot, scrape it well and cut it into pieces.\n" +"Boil them well with sufficient water.\n" +"Allow it to cool.\n" +"Strain to separate the pieces from water.\n" +"Mix together the carrot pieces, sliced banana, almonds, cashews, sugar and 1/2 a glass milk.\n" +"Grind them well, till you get a thick smooth shake.\n" +"Add the rest of the milk and blend well.\n" +":- Serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Khajoor Mix Shake");
        cv.put(DESCRIPTION,"A healthy drink to boost up your energy level..");
        cv.put(INGREDIENTS,"dates - 25 pcs\n" +"(without seed and chopped)\n" +"Rosewater - 1 tbsp\n" +"Milk - 1 ltr\n" +"Cherupazham (small Banana) - 2 nos (chopped)\n" +"Mango (riped) - 1 no\n" +"(cut into pieces)\n" +"Sugar - 3 tbsp\n" +"Milk powder - 2 tbsp\n" +"Pistachios green - 1 tbsp\n" +"(chopped)\n" +"Saffron - 1 big pinch\n");
        cv.put(PROCEDURE,"In a blender put milk powder, sugar, dates and quarter portion of milk and blend it to a thick cream.\n" +"Add banana, mango, rose water and rest of milk and make a thick juice.\n" +"Keep them refrigerated for 2 hours.\n" +"Then pour into ice cream glasses and spread pistachios and saffron on the top.\n" +":- Serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mash Melon Shake");
        cv.put(DESCRIPTION,"A cool drink with kharbooza and milk..");
        cv.put(INGREDIENTS,"Mash melon - 1 no\n" +"Milk - 2 - 3 cups\n" +"(depending on mash melon size)\n" +"Sugar - 3 tsp\n" +"Honey - 2 tsp\n" +"Cardamom (Elakka) - 1 no");
        cv.put(PROCEDURE,"Cut the mash melon and using a spoon, scoop the flesh.\n" +":- Discard the seeds.\n" +"Put the fleshy pieces in a blender and blend well.\n" +"Add milk, sugar, honey and elaichi and blend once again.\n" +"Cool and serve.\n" +":- Can add a drop of vanilla essence or rose essence instead of elaichi.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Plain Sharjah");
        cv.put(DESCRIPTION,"Orginal sharjah recipe..");
        cv.put(INGREDIENTS,"Milk (chilled/frozen) - 1/2 litre\n" +"Cashewnuts - 100 g\n" +"Horlicks/bournvita/maltova/chocolate horlicks/ovaltine - 2 tbsp\n" +"Plantain(medium size) - 1 no\n" +"Sugar - As reqd(normally 4 or 5 tbsp)");
        cv.put(PROCEDURE,"Grind the above ingredients in a blender for 2 minutes.\n" +"Its ready to serve in milk shake glasses.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Soya Milk");
        cv.put(DESCRIPTION,"Soya milk made from soya chunks..");
        cv.put(INGREDIENTS,"Soya Chunks - 300g\n" +"Vanilla Pod/Pandan leaf - 2 nos Water - As reqd\n" +"Sugar/Rock sugar - As reqd");
        cv.put(PROCEDURE,"Soak soya chunks in sufficient water for a day.\n" +"Change water and refresh with clean water next day to dispel the smell.\n" +"Remove and drain the soya. Use your finger to remove the outer skin.\n" +"Fill a blender, with just a handful of soya and add enough water to the level of soya.\n" +"Blend or pulse it till it is milky. Strain into a jug.\n" +":-repeat the same with the remaining soya.\n" +"Take a pan and simmer the soya milk with rock sugar and vanilla pods. If using pandan leaf, knot it up.\n" +":- simmer the soy milk in a similar way as you would do for milk.\n" +"Remove the scum that forms on top of soya milk.\n" +"Strain into a vessel. Cool and enjoy the drink. For lasting purpose, you can refrigerate.\n" +"Tips:-\n" +"1)Soy milk is rich in isoflavones and reduces cholesterol.\n" +"The long green leaves of pandan plant are very fragrant and aromatic. It can be used as a substitute for vanilla pods.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Bloody Mary");
        cv.put(DESCRIPTION,"Must Try cocktail..");
        cv.put(INGREDIENTS,"Known Brand Gin - 9 oz\n" +"Tomato juice - 18 oz\n" +"Lemon juice\n" +"Worcestershire sauce - 3 tsp\n" +"Hot pepper sauce - Few dashes\n" +"Pepper - As reqd\n" +"Salt - As reqd\n" +"Lime wedge for garnishing\n" +"Celery stick for garnishing");
        cv.put(PROCEDURE,"Stir all the ingredients with ice in pitcher and pour into glass over ice.\n" +"Garnish each serving with wedge of lime and celery stick.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Fireball");
        cv.put(DESCRIPTION,"A must try cocktail - vodka..");
        cv.put(INGREDIENTS,"Vodka - 60 ml\n" +"Green chilly\n" +"(preferably a long one)\n" +"Lemon\n" +"Salt\n" +"Cold water - 120 ml");
        cv.put(PROCEDURE,"ake a cocktail glass (martini) and rub a slice of lemon along the rim.\n" +"Flip the glass over and dip it into a bowl of salt.\n" +"Pour the vodka into the glass and and squeze in a full lemon.\n" +"Slowly pour the water in it.\n" +":- Take care not to add too much water, or else the drink would not taste as intended.\n" +"Slice the green chilly along its length till 3/4th of its length.\n" +"Stick it on the rim of the glass and wait for some time for the chilly to set in.\n" +":- Sip the drink slowly rotating the rim of the glass to ensure the salty taste.\n" +":- For a repeat, you can use the same chilly, this time with the other side into the inside of the glass.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Ginger Wine");
        cv.put(DESCRIPTION,"Wine made out of Ginger..");
        cv.put(INGREDIENTS,"Ginger - 1/4 kg\n" +"Sugar - 3/4 kg\n" +"Citric acid - 20 gm\n" +"Water - 2 1/4 lt");
        cv.put(PROCEDURE,"Clean ginger and slice it into small pieces.\n" +"Add water to the sliced ginger and bring it to boil.\n" +"Once it starts boiling, add sugar and bring the flame to sim for 20 mins.\n" +"Remove from the flame and allow it to cool.\n" +"Add citric acid to the cooled mixture.\n" +"Refrigerate.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Hot Toddy");
        cv.put(DESCRIPTION,"Tea mixed with Brandy..");
        cv.put(INGREDIENTS,"Honey - 1 tbsp\n" +"Tea - 3/4 glass\n" +"Brandy - 2 shots\n" +"Lemon slice - 1 no\n");
        cv.put(PROCEDURE,"Brew tea and fill a tall glass upto 3/4 full.\n" +"Mix in honey.\n" +"Mix in brandy shots.\n" +"Add lemon slice and enjoy.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Martini");
        cv.put(DESCRIPTION,"Shaken , Not Stirred..");
        cv.put(INGREDIENTS,"Freezing \"Bombay Sapphire\" gin -\n" +"2 1/2 ounce\n" +"Cold \"Noilly Prat\" dry Vermouth - A splash\n" +"Green olives - 2 nos\n" +"Shaker\n" +"Large Martini Glass - 1 no\n" +"Olive Spear\n" +"Ice - As reqd");
        cv.put(PROCEDURE,"Chill a Martini glass in the freezer for about 10 mins.\n" +":- Martinis are best served at the lowest possible temperature.\n" +"Fill a martini shaker about 3/4 full of cracked, clean ice.\n" +"Pour your gin into the shaker and let stand for 60 seconds.\n" +"Shake, shake, shake, about fifteen, vigorous, diagonal shakes should suffice.\n" +"Put the shaker down and allow it to rest for another 60 seconds.\n" +"Get a well chilled martini glass from the freezer.\n" +"Pour a small amount of Vermouth into the glass and swirl the vermouth in the glass so that the sides of the glass are coated.\n" +":- Discard the remaining Vermouth.\n" +"Spear an olive or two and place it in the glass.\n" +"Strain the gin into the glass.\n" +":- Serve.\n" +"Variations:-\n" +":- Vodka Martini - Replace gin with vodka.\n" +":- Dirty Martini - Add 1/2 oz of olive juice into the shaker along with the gin/vodka. Add more olive juice if you like extra dirty martinis.\n" +
                ":- Replace olives with a lemon twist or a pickled onion.\n" +"Tips:-\n" +":- Keep gin/vodka in the freezer.\n" +":- A cheap, lower quality ingredient will leave you disappointed. Good liquor, crisp olives, quality mixers will put a smile on your face.\n" +":- Keep your vermouth in the fridge so that you don`t warm your glass when you swirl with it.\n" +":-You can use different kinds of stuffed green olives to suit your mood, like pimento, jalapeno, garlic, lemon twist, mushroom, bleu cheese, sun dried tomato, turkish pepper etc\n" +":-Feel free to use your favorite gin and vermouth... after all your perception is your reality!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Pain Killer");
        cv.put(DESCRIPTION,"Nice drink..");
        cv.put(INGREDIENTS,"Dark rum - 4.5 oz\n" +"Pineapple juice - 1.5 oz\n" +"Orange juice - 1.5 oz\n" +"Coconut cream - 1.5 oz\n" + "Nutmeg\n" +"Cherry");
        cv.put(PROCEDURE,"Shake all the ingredients (except nutmeg and cherry) well with ice.\n" +"Strain into a chilled highball glass.\n" +"Top it with nutmeg and cherry.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Rusty Nail");
        cv.put(DESCRIPTION,"Great drink..");
        cv.put(INGREDIENTS,"Scotch - 2 oz\n" +"Drambuie - 1 oz\n" +"Lemon twist\n" +"Cherry\n");
        cv.put(PROCEDURE,"Mix both ingredients in a mixing glass with ice.\n" +"Strain into an old fashioned glass.\n" +"Garnish with lemon twist and cherry.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Salty Dog");
        cv.put(DESCRIPTION,"A cocktail with either vodka or gin..");
        cv.put(INGREDIENTS,"For single serving:-\n" +"Gin or Vodka - 60 ml\n" +"Grape juice - 120 ml\n" +"Salt\n" +"Lemon slice");
        cv.put(PROCEDURE,"Take a tall glass and rub a slice of lemon along the rim.\n" +"Flip the glass over and dip it into a bowl of salt.\n" +"Pour the gin or vodka into this glass and fill it with grape juice.\n" +"Gently stir and serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Tequila Cocktail");
        cv.put(DESCRIPTION,"Tequila with Vanilla icecrem and fresh Strwberry..");
        cv.put(INGREDIENTS,"Vanilla ice cream - 2 tbsp\n" +"Fresh cream - 1/4 glass\n" +"Fresh strawberries - 4 nos\n" +"(cut halved)\n" +"Silver Tequila - 30 ml or 60 ml\n" +"(as you like)");
        cv.put(PROCEDURE,"Blend them all together with hand mixer or in a mixi.\n" +"Once it became a creamy texture, pour into a Margarita glass or any bowl glass.\n" +":- Serve after decorated with a fresh strawberry!!\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Berry Nice");
        cv.put(DESCRIPTION,"Strawberries with grenadine and other ingredients..");
        cv.put(INGREDIENTS,"Strawberries - 9 nos\n" +"Grenadine(red syrup) - 1/2 cup\n" +"Double cream - 1/2 cup\n" +"Dry ginger ale - 1/2 cup\n" +"Ginger - 1/2 tsp(ground)");
        cv.put(PROCEDURE,"For preparing berry nice, place the strawberries, grenadine and cream in an electric blender with some crushed ice. Blend it on maximum speed for 30 seconds.\n" +"Pour it in a tall glass.\n" +"Add in the dry ginger and stir it.\n" +"Berry nice is ready. Sprinkle with a little ginger on top, decorate it with strawberries and serve chilled.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Creamy Sour");
        cv.put(DESCRIPTION,"Lime cordial cream, honey dew and angostura bitters..");
        cv.put(INGREDIENTS,"Lime cordial - 2 cup\n" +"Double cream - 1 1/2 cups\n" +"Honey dew - 2 tsp\n" +"Angostura bitters - 3 tsp");
        cv.put(PROCEDURE,"For preparing creamy sour, place the lime cordial, cream and honey dew in a blender with some crushed ice. Blend until smooth.\n" +"Pour into a cocktail glass and add angostura bitters.\n" +"Creamy sour is ready. Serve immediately.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Mango Margarita");
        cv.put(DESCRIPTION,"Mango Margarita..");
        cv.put(INGREDIENTS,"Tequila - 1 oz\n" +"Mango liqueur - 1 oz\n" +"Lime juice - 1/2 oz");
        cv.put(PROCEDURE,"Shake the tequila, mango liqueur and lime juice with ice cubes in a cocktail shaker.\n" +"Strain into a salt-rimmed cocktail glass, and serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Panakam");
        cv.put(DESCRIPTION,"Jaggery, dry ginger powder and other spices are mixed together in water..");
        cv.put(INGREDIENTS,"Jaggery - 2 tbsp(grated)\n" +"Dry ginger powder(Chukku podi) – A pinch\n" +"Black pepper powder – A pinch\n" +"Water - 2 cups\n" +"Cardamom powder– A pinch\n" +"Salt - A pinch");
        cv.put(PROCEDURE,"For preparing panakam, dissolve the jaggery in water and strain it.\n" +"Add all the other ingredients: dry ginger power, black pepper powder, cardamom powder, and salt into jaggery water.\n" +"Keep in fridge till chilled.\n" +"Panakam, a tradition tamil drink recipe is ready.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Kalingad Cooler");
        cv.put(DESCRIPTION,"Iced drink..");
        cv.put(INGREDIENTS,"Water melon juice - 2 cups\n" +"Vanilla ice cream - 4 scoops\n" +"Lemon juice - 2 tbsp\n" +"Rock salt(powdered) - 1 tsp\n" +"Cuminseeds (roasted & powdered) - 1 tsp\n" +"Watermelon (cut into cubes) - 1 cup");
        cv.put(PROCEDURE,"For preparing kalingad cooler, mix lemon juice and water melon juice.\n" +"Freeze till it solidifies & cut it into cubes.\n" +"Take a few cubes in a glass.\n" +"Sprinkle black salt & jeera powder.\n" +"Put a scoop of ice cream.\n" +"Make another layer of cubes, salt, cumin powder & ice cream.\n" +"Put the water melon cubes at the top.\n" +"Serves decorated with water melon seeds.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Beetroot Squash");
        cv.put(DESCRIPTION,"Beetroot Squash..");
        cv.put(INGREDIENTS,"Beetroot - 1 kg\n" +"(peeled\n" +"washed and cut into pieces)\n" +"Water for boiling beetroot - 2 cups\n" +"Sugar - 1 kg\n" +"Water - 8 - 10 cups\n" +"Fresh lime - 5 nos\n" +"Citric acid - 1 1/2 tsp\n" +"(can be replaced with 3 lemons)\n" +"Grape or Strawberry essence - 1 tsp(optional) ");
        cv.put(PROCEDURE,"Pressure cook the beetroot pieces with 2 cups of water.\n" +"Grind this until you get a smooth pulp.\n" +"Strain it.\n" +"Add 1 more cup of water while straining.\n" +"Boil sugar in the remaining water.\n" +"When the sugar completely dissolves and starts sticking, add the pulp to the sugar syrup.\n" +"Add essence, citric acid and lime juice to it and stir well.\n" +"Pour the squash into a dry bottle when cool.\n" +"Refrigerate.\n" +":- Please add water while making the drink. Add more sugar if needed.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Cajun Banana Smoothie");
        cv.put(DESCRIPTION,"Banana smoothie with a twist..");
        cv.put(INGREDIENTS,"Ripe banana(large) - 1 no\n" +"(thinly sliced)\n" +"Fresh strawberries - 1/2 cup\n" +"(thinly sliced)\n" + "Skim milk (2%) - 1/4 cup\n" +"Brownsugar - 1 tsp\n" +"Banana yoghurt - 1/2 cup\n" +"Dark rum - 1 oz\n" +"Banana brandy - 1 oz\n" +"Orange peel(grated) - 1/4 tsp\n" +"For garnishing:\n" +"Banana slices - 3 nos\n" +"Mintleaves - 3 sprigs\n" +"Whole strawberries - 3 nos");
        cv.put(PROCEDURE,"Place bananas and strawberries in a bowl and freeze.\n" +"Remove, after frozen and place in a blender.\n" +"Add skim milk, yoghurt, orange peel and sugar.\n" +"Blend at medium speed, until thick.\n" +"Add rum and brandy.\n" +"Pour into a chilled champagne saucer.\n" +"Arrange strawberries, banana slices and mint on long toothpicks.\n" +"Rotate into drink.\n" +":- Serve.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Easy Cool Drink");
        cv.put(DESCRIPTION,"An easy way to cool urself in hot summer..");
        cv.put(INGREDIENTS,"Milk - 1 glass\n" +"Chocolate ice cream - 2 big spoon\n" +"Bread slice(ordinary bread) - 1 no");
        cv.put(PROCEDURE,"Mix all the ingredients in a blender, till it gets completely blend.\n" +"Serve in 2 glasses decorated with nuts etc.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Fruit Smoothie");
        cv.put(DESCRIPTION,"Fruit Smoothie made with strawberries..");
        cv.put(INGREDIENTS,"Fresh strawberries\n" +"stemmed and sliced or 2 cups frozen strawberries\n" +"slightly thawed - 1 pint\n" +"1 % milk - 1 cup\n" +"Plain or vanilla low-fat yoghurt - 1 cup (8 oz)\n" +"Honey - 1/2 cup\n" +"Vanilla extract - 1 tsp\n" +"Crushed ice (5 - 6 cubes) - 1 cup");
        cv.put(PROCEDURE,"In a blender or food processor container, combine all ingredients.\n" +"Process, until smooth.\n" +":- Serve immediately.\n" +":- For variety, use 2 cups of any fresh or frozen fruit or combination of fruits such as sliced strawberries and bananas or sliced peaches and whole raspberries.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Then Nellikka & Vine");
        cv.put(DESCRIPTION,"Gooseberry in honey..");
        cv.put(INGREDIENTS,"Gooseberry(Nellikka) - 20 nos\n" +"Honey - 500 gm\n" +"Turmeric - 1 tsp");
        cv.put(PROCEDURE,"Wash gooseberries in water and dry them on a towel.\n" +"Take a clean glass vessel and put them.\n" +"Pour 250 gm of honey and put turmeric powder.\n" +"Mix well and close tightly. Shake at times.\n" +"Keep for 21 days.\n" +":- All the water from gooseberries will be drained by that time.\n" +"Remove them from the water and put in another vessel.\n" +"Strain the liquid(vine) into a clean bottle and keep for 21 days.\n" +":- This is a very healthy vine.\n" +"Add balance 250 gm honey and keep for 4 months.\n" +"When the gooseberries become sweet with honey, you can eat one per day.\n" +":- Its said that it prevents hair greying.\n");
        db.insert("recipes",null,cv);

        cv.put(RECIPE_NAME,"Spicy Vegetable Biryani");
        cv.put(DESCRIPTION,"Spicy Vegetable Biryani..");
        cv.put(INGREDIENTS,"Basmati rice - 2 1/2 cups\n" +"Onion - 2 nos\n" +"Garlic pods - 10 nos\n" +"Ginger - 1\" piece\n" +"Oil - 2 tbsp\n" +"Ghee or Butter - A scoop of tbsp\n" +"Chopped tomatoes - 1/2 of the tin\n" +"Green chillies (small) - 2 nos\n" +"Bell peppers - 1 - 2 nos\n" +"Mushrooms and Vegetables - As your wish*\n" +"Lime or lemon juice - 2 tsp\n" +"Yoghurt - 2 tbsp\n" +"Spices :- Cloves\n" +"Cinnamon\n" +"Cardamom \n" +"Garammasala - 1 spoon\n" +"Biriyani masala - 1 spoon\n" +"Royal curry powder or chilly powder - As reqd\n" +"Turmericpowder - 1/4 of a small spoon\n" +"Salt - As reqd\n" +"Corianderleaves\n" +"*Can use potatos\n" +"greenpeas\n" +"carrots\n" +"beans");
        cv.put(PROCEDURE,"Grind garlic, ginger, one-fourth of the onion & green chillies together with a little amount of water & keep aside.\n" +"Wash the rice & soak it in the water & keep aside.\n" +"Heat oil & ghee/butter in a pan.\n" +"Add the remaining onion & fry them until it turns to golden brown.\n" +"Add the spices to them & saute for 2 mins.\n" +"Add the ground paste & fry for 5 mins.\n" +"Add the tomatoes, turmeric powder, salt, garam masala, biriyani masala, royal curry/chilly powder to it & cook for 5 mins on low flame.\n" +"Add all the vegetables, bell peppers, mushrooms & close the lid & cook for 5 - 10 mins.\n" +"Drain the water from the rice & add to them & stir for 2 - 3 mins.\n" +"Add lime juice & yoghurt to it & stir well.\n" +"Add 5 cups (same 1:2 ratio of rice & water) of water to it & close the lid.\n" +"Cook until the rice is done in the stove or in the oven.\n" +":- Oven cooking tastes better.\n" +"Finally, add the coriander leaves for better flavour.\n" +
                ":- Serve with mint or onion flavoured yoghurt.\n" +":- It is not necessary to use all the spices & masala powders. We can use what we have. But for perfect Indian taste, the specified things would be better. Garlic-ginger-chillies-onion paste is the magic & we can very well feel that, when we add them.\n");
        db.insert("recipes",null,cv);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public String[] show(String nm)
    {

        String x,y,z,w;
        Cursor c;
        this.getReadableDatabase();

        c= sdb.rawQuery("select * from recipes where name ='"+nm+"'" ,null);
        String p[]= new String[10];

        while (c.moveToNext()){

            x=c.getString(c.getColumnIndex("name"));
            y= c.getString(c.getColumnIndex("des"));
            z = c.getString(c.getColumnIndex("ing"));
            w = c.getString(c.getColumnIndex("pro"));

            p[0]=x;
            p[1]=y;
            p[2]=z;
            p[3]=w;

        }
        return p;
    }

    public String[] xyz(String pr) {
        String x, y, z, w;
        Cursor c;
        this.getReadableDatabase();

        c = sdb.rawQuery("select * from recipes where name ='" + pr + "'", null);
        String p[] = new String[10];

        while (c.moveToNext()) {

            x = c.getString(c.getColumnIndex("name"));
            y = c.getString(c.getColumnIndex("des"));
            z = c.getString(c.getColumnIndex("ing"));
            w = c.getString(c.getColumnIndex("pro"));

            p[0] = x;
            p[1] = y;
            p[2] = z;
            p[3] = w;


        }
        return p;
    }

    public void bookMarkTable(){
        this.getWritableDatabase();
        String bquery = "CREATE TABLE IF NOT EXISTS bookmarks(bname text )";
        sdb.execSQL(bquery);
        Log.d("table","done");
    }

    public int save(String n){

        Cursor c;
        this.getReadableDatabase();

        c = sdb.rawQuery("select * from bookmarks where bname ='" + n + "'", null);
        if(c.moveToFirst()){

            return 1;

        }
        else {
            sdb = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("bname",n);
            sdb.insert("bookmarks",null,cv);

            return 0;
        }
    }
    public String [] cheak(){
        Cursor c;
        int k = 0;
        String x;
         sdb=this.getReadableDatabase();

        c= sdb.rawQuery("select * from bookmarks " ,null);
        String p[]=new String[c.getCount()];

        if(c!=null){
            if(c.moveToFirst()){
                do{
                    x=c.getString(c.getColumnIndex("bname"));
                    p[k]=x;
                    k++;
                }while(c.moveToNext());

            }
        }

        return p;
    }
}



