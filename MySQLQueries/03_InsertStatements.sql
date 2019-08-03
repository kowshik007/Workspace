SELECT CHAR_LENGTH(SHA2('Thisisfun@7', 256));
insert into auth_user(username,userpassword,created_timestamp,modified_timestamp) values("kowshik",SHA2('Thisisfun@7', 256),now(),now());
insert into category(category_name,category_image,created_timestamp,modified_timestamp) values("Windows","C:\Users\kowsh\OneDrive\Pictures\Screenshots\Screenshot (1).png",now(),now());
SELECT 
    *
FROM
    category;
insert into subcategory(category_id,sub_category_name,created_timestamp,modified_timestamp) values(1,"Windows 10",now(),now());
SELECT 
    *
FROM
    subcategory;
insert into article(userid,subcategory_id,articlename,articledescription,created_timestamp,modified_timestamp) values(1,1,"ArticleName1","ArticleDescription1",now(),now());
SELECT 
    *
FROM
    article;