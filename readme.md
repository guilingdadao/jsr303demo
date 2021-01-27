
@AssertFalse 被注解的元素必须为false
@AssertTrue 被注解的元素必须为True

@DecimalMax(value) 被注解的元素必须为一个数字，其值必须小于等于指定的最小值
@DecimalMin(Value) 被注解的元素必须为一个数字，其值必须大于等于指定的最小值

@Digits(integer=, fraction=) 被注解的元素必须为一个数字，其值必须在可接受的范围内

@Future 被注解的元素必须是日期，检查给定的日期是否比现在晚.

@Max(value) 被注解的元素必须为一个数字，其值必须小于等于指定的最小值,检查该值是否小于或等于约束条件中指定的最大值. 会给对应的数据库表字段添加一个 check的约束条件.
@Min   BigDecimal，BigInteger, byte,short, int, long，等任何Number或CharSequence（存储的是数字）子类型     验证注解的元素值大于等于@Min指定的value值

@NotNull 被注解的元素必须不为null
@Null 被注解的元素必须为null

@Past(java.util.Date/Calendar); 被注解的元素必须过去的日期，检查标注对象中的值表示的日期比当前早.

@Pattern(regex=, flag=) 被注解的元素必须符合正则表达式，检查该字符串是否能够在match指定的情况下被regex定义的正则表达式匹配.

@Size(min=, max=) 被注解的元素必须在制定的范围(数据类型:String, Collection, Map and arrays)

@Valid 递归的对关联对象进行校验, 如果关联对象是个集合或者数组, 那么对其中的元素进行递归校验,如果是一个map,则对其中的值部分进行校验.

@CreditCardNumber 对信用卡号进行一个大致的验证

@Email 被注释的元素必须是电子油箱地址

@NotEmpty 被注释的对象必须为空(数据:String,Collection,Map,arrays)

@Range(min=, max=) 被注释的元素必须在合适的范围内 (数据：BigDecimal, BigInteger, String, byte, short, int, long and 原始类型的包装类 )

@SafeHtml(whitelistType=, additionalTags=)被注解的元素检查是否标注值包含恶意的片段如

@ScriptAssert(lang=, script=, alias=) 任何类型,要使用这个约束条件,必须先要保证Java Scripting API 即JSR 223 ("Scripting for the JavaTM Platform")的实现 在类路径当中. 如果使用的时Java 6的话,则不是问题, 如果是老版本的话, 那么需要把 JSR 223的实现添加进类路径. 这个约束条件中的表达式可以使用任何兼容JSR 223的脚本来编写. (更多信息请参考javadoc)

@URL(protocol=, host=, port=, regexp=, flags=) 被注解的对象必须是字符串，检查是否是一个有效的URL，如果提供了protocol，host等，则该URL还需满足提供 的条件

@Length(min=下限, max=上限)     CharSequence子类型     验证注解的元素值长度在min和max区间内

@NotBlank     CharSequence子类型     验证注解的元素值不为空（不为null、去除首位空格后长度为0），不同于@NotEmpty，@NotBlank只应用于字符串且在比较时会去除字符串的首位空格

@FutureOrPresent

@Negative

@NegativeOrZero

@PastOrPresent

@Positive 输入的数字必须是正数

@PositiveOrZero 输入的数字必须是正数包括0

@CreditCardNumber(ignoreNonDigitCharacters=)

@Currency(value=)

@DurationMax(days=, hours=, minutes=, seconds=, millis=, nanos=,inclusive=)

@DurationMin(days=, hours=, minutes=, seconds=, millis=, nanos=,inclusive=)

@EAN

@ISBN
 
@ValidPart  
Set<@ValidPart String> parts = new HashSet<>()
 
@MaxAllowedFuelConsumption    
Map<@NotNull FuelConsumption, @MaxAllowedFuelConsumption Integer> fuelConsumption = new HashMap<>();
 
@MinTowingCapacity(1000)        
private Optional<@MinTowingCapacity(1000) Integer> towingCapacity =Optional.empty()




















