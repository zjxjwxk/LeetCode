package com.zjxjwxk.leetcode._1044_Longest_Duplicate_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestDupSubstring1() {
        String s = "banana";
        String ans = "ana";
        assertEquals(ans, solution.longestDupSubstring(s));
    }

    @Test
    void longestDupSubstring2() {
        String s = "abcd";
        String ans = "";
        assertEquals(ans, solution.longestDupSubstring(s));
    }

    @Test
    void longestDupSubstring3() {
        String s = "dcecccaedebdcedcbaaddbbdbccbcbdcecbddaaedecbeccdeabdceebcaaeccbbcdcdaceceeacedadcdddbbbaedeaebbbecbeebdcdebadabaecacdeeeabeaaaeacbdacedabbadcbeddebbbcebedeecdbebbdbcebacebdaaceabdbdcaebddeaeccaccbcebdacddbdddbadecbadaacaadcdececadeebbacedebeddcaacedacbcaadecdeecddbdbbbcccedeaaeecededdaccddbdccdcdddddcdacceabbcebdebddbcbbaaababceebdaaeababeacaeddccecadebeceeddaddbdbdebcbceceeacedcaedcebeeeadbbecdecaeabaeedbdddaececeebcaddbcaaeebcbeccbedcdeccebeebdbaceddebddabebbabbcedbbedacecbaebaaedbeaeaebbaaeeeebbbbeecdecdcedbcdbbbdcaecdbbcadbeebaebcaebccadecdccabbddbddeaeeaecccbeacdcbeadadadacbceaaeceebcdcddceeebebedececacadbedeeebdecadbebebebecaeeecbdceecdcacadceadcceaebcbaceeceeaaedecaddbaacacdbedebeeccadbccdeccdcadcdaadbabddbbdaacbaaaceeecaadcabadbeecadeebbdcebabedcddbebdcbaccdaabebcbacbedadeacbbcacadbdabbaccadadddeabdcbbdeacdbeededdecebceacabdceaeaaeaacbbbacabccedddeceadceedacccedaaceadeabccbdaeadcabbccadaecddebbadeecadccbacebdaabbeacdccaedeeeaaadaaaddebeadcbbdcebeeaebecdbacccbaeadcbacabbbeedeaaccaebddaaceadebeedebabdbbecebeabddeeecaeedddabacbbdbddebbadadcbeacecdaabcaeddceebceebaecccadeecbbdbeaeedcdeaabadcdeaebaaaadbdadeeaadadcabeceadbbdedadaaaecdacdbcedbeabcbeaeacaecebdeaedacbcbeaebcabdaabaddecadbeaecdcbebbbccbbddbccdebaaeecccddaaeccedebabacdeecbbbbccdedcbcebeceedcaacbeaacabdbbeeebdcddbceebdaddacadadceaaeecabaecadcdabbccaabcdbeededadcbecbebcdceabccecbebbbccbcddccebdeacbebabeecbebacceecbdddeeeeabeaabcdbecbbdacdccadbeeaccecdbcddcdacbaddcacdacdbebeaabdadeaadcacedcccdcdbddaaebacecbdccdbaabdecadddedcbbaaacdeaddcdcebcaeccbcbcdaaeceabaedeeeadebcaadbbedbccbaabdbdccbabceabeeccbbadbaecedddccedaeaabcbaaeabcdbdbdaabcedbbbdbeabaedcbdabeeabbadecadeadabcbdaebdbcbecccaaeadcaaebcccdacabdbecebbedaaeebcadbeeeebebccdaceedecdedceaceaeabccbebaccebdceabbdadcdccbeeebbbbaedebecbbbeabebdabdcdcbcbedaedcbcaebbccdbacdccbbcbadcbbaccbebaaabaaaedccdceecababeacddacceeabeaabaaeccceccecddeecdadedeaadabaccabbadaaecbebccbabaadcbecebedbaececeabdebcadaddcaebeeabbebedeadcdccbadabcecbacecbdbccebcbbaadceadbacadeeebcddcdddccaeaababdcddeebaaddcbcaaddceedacdaaeaadcedeeaeaddebdabaddddbadccbdbebcecdccebeebdcccbeedbcceebbadcdebaeedbecccdbaedcdbcbbaaaaabbbdaddabdbbeebdeabedededbdbcecedadbaebddcabbbabecacdedccbeaacaeaccadcbeebaadceddbdacbbadccacbadcdddabcccaababebdceeddcaebbaebeeedabdbcacabdcbaceabcccdcacacbbaeeaaddedaabccaabbeaccaceecbaacbeebcbeaecdbcaeaaaedcdbebcaaaaacaabbbbccbceebbbaaaceccabdeceeeddbabadddeeaaebbabbeaadaacacdebbaadbaeebbdebbabbbbbeadbebadacdcdbaccaebaadccbabcadccbeaacadeabcadebbcadabaaaaeccaddbbebcdabdededddeadcbceacebaeeddeaebedbebaeabebcadcdbccdbdbdeccaebddeaabccdaecebdededddcbbcacdcbaedcebdedaaceebccbcdababaeaacabcddaadacaadbadcdbbedaebddebedceddddceadeaebbebbaabdeabdcdabccdcedaddeaeddecdecbeebeedaadbcbbebcbeecedaabcacaabdbaecaeebeaedadbabecbaabbebadaccadeebeeebbecdcaecaeacadeabbadceaeccbcdbebaaabebaacdebbcaaeadccbebcebebebbedddacbbccbedbecbeaebecedacdcdbbebdaedeabcabaaaeebbdbbaddadcebbacecbaacddecbddeecbbedecedbbaebddeeacbcdedbdaddbbaecdccaedcebeeebaacaaabcbddccacbccbacdbebaeadbeaacacbceddbaeabaaaadaabbcddaabcabeeccabcebacdacbadbdebddaddeaabeebbbbbbacbdddecbaddcdeaaaeecbbcedcbecddbebeccaacaedabdacabdaabdbadccddedecdebadcdcadbedeecbdddaacdbdcadddacaedceacaecaebcecedeaeadbabccdbdeacebaccaabccccdcecaecadeaddeaeddabcbadedceebdaacdadebbeebdeedcecebdeecaaeccbcdddddadbbbcbaabccabebabdcdcaacadaaeebbbedbdecabcceeccabadbbaddcdbeaaeeadaddeebaecaedecccaadbdeddbbbeeceeaaccaedadddbaecacccadaeecdecabccabbebcacedbeadccddeaadacdcbeedeaeabcbccbbdcdaeedbcabaaccaccbdaacebacaecdacbebddbbbdddebacadaaadbdcbcaccdddeedbecbcdcbaeaacbabbeaeebbadadaebbccaebebdeeceecbabdebcebeaadebdbbddcaeddbcadeadaabdccdecdcaccaecccdeaaacdbdccadacbdbaaccdbddbecaacbcbbdbedecedecbaacadccaedbacabddaeccdecaaeeecadddeaaadcdaedeadedbeeccccabeadaebcaaecacebdcdaaadedccacdceaeededcaaedceccedccebdacbececeeaebaecbdeecdbaeeeeeadececcdcabbddadecdddabdeeedccabbaebddedecccacdbdcbbcddcaecbdaddcadacbbccceccecacddcbaedcbbeecedbeecdeaaeeeecdcabcebecbcebbceabaddeacaedaabadebcecdadbebcbbeeaceaacbdcaabacadaebebcdceeeacaacaddeaadabaceeecbccbecbdabebebccdadeedaadaecceacaabeacdaebeecbdcbbdeddbeebdadbabbeaddbcdccdbcebddaebeddcaecdededebebdaabdddaecedddabbeeebadbbbdebeeecbbebaebdeebceaeaedbecbbcadadbeacceeecbabaeadbdedccbbbbaabeabbbdadceedaaddcbbceadbbaebebebbdeadcaabdeebaaebbeecaddecccbddcdebadcebbaacddbbeecadbcaebdebaaeeaadbaeeeedbcabebceccebabbeebcddebcdbdabcbcbbcadecbdacedadacdbbebeebaddecbccaeaeccedbcddededdecbcecdeaabeceeadbcbeaaccaeccceadecaaacbaaccaccbeeeceddadaabdeeaedbcceabeabbbcaeededdcdcbdbbedecbbdbeeeccadcadedeacbbcdbebcbeaedbcbdbdabbdcacacadeedbebddeddccaeebceddeeebdbbabcaebdbdbedeeadbabaadddcaabbbbcabeeddbbadabacceabcbceddeceadcdbaeadaedebecdecbdbabdcacddbccbaedcceabbecabdacbdcbaeaeccceecabbaeaecdeadabaeeedeeadeebbacdaceadedecedebbbcbaccaacebbebadaeaecbeebadaaceaabebdbddeecedcbcbcdbcdaccacbbbdaddacbcaaaebdcadbcaeeaacacebeebaeeecbdeedddcebcbeaabdedbaddabcadbbaeadccdbcebddadebaaabcaeadcedaadcaeedcbbcdbcdbcdcbdcebaaadededdccebebbedcadeadeeadeebbdceebdddacebdedbbcdabbcdacbbdcccacdbacbbaeeeacbedceaedebbacdbeebaebbaeacaccaecdeacbbaacaceebedaacdcebaaacadcdeceaeeadcadceaeeabeecaabbabbebdecdcadadebabddbabebdbadeabcdadbbcaadcdbdbabddebcbcbeddabbcabaebcbccddbbbbebdbdabcdcddbdbceecadbadadbdcbadedecdcbaebcaaddbeebceaceeaacceabcacaccddcebcabbebddecddbedbddaeadebbcdccddeebebbaceaaeeebcdceeebdccbaababcdcbdcebbbbcaeccecaadcaeabababbcdaeaecdcbaddbacbaeecdcdecccabcddbbbcdcadadabcbcedaadaacceaededbaecaeadabdcd";
        String ans = "dccdbcebdda";
        assertEquals(ans, solution.longestDupSubstring(s));
    }

    @Test
    void longestDupSubstring4() {
        String s = "dcxjvsmiyywfcdtcchcmhhesdrhrgtgjxglmvjrvqksrgjjtkkaqefncopnisivglweudfevyugvidgjobcwrsogvwszhmcaegwgvybdprfywkhtcorxozvstqlglpbvxinhsuiccubybnxxjtocutsohwapdcbbiunnaqmxemqpixrdvwomhfjfmtgceehhnixvldskralfiupubgwoehxyxcbtphsmpjdrmpwvemezhwnmowqhtqmnrrsfkuctxdludcclxstrgmcqycoswjuddwhbbfeqnzvnsemzzbhfzjmmaptjbryzathorgakwyaylbvjitvdedfxatnhsmzvwhgtumzkfxyihigwdzrntadgmsngkitppefngkkdyupdvpdombmnezasuedjrdujnzbfybupodtqalhetmepsuaxtsvhwfsvspimxeqttffbwmfxxdphkwjtltvjwkwrzrclrjblcxqiqkbdkaspxzzznqafeoxmrksyhgoytklkugslndygkcrpyoicmifqaaiqkbpucsstsravyveriencnnwtbmnstlxnrprbzhmsopwsncxjxavlplkopjtzdisvureirefakeypjtknbpowqidiqatyndzecpfvyrkqwgrntegcdavpmbyoelqcaajetqjcgtktpbqkycclbqpfmlpzydjhrgsinezsghabqaafacevwcborjsswycdbpzsqeufoojeupeybpbapyqgjluktflmkyakxujwezcxamuzsztxtcntfovadkxgijyhcvzbnxgxnrbgjcituaddfjpsnikrqflrvwfxrazfexdpxrbprhiidlrancoolcxbmchrcaezkqtzfftihqaltnygvraxmufjqmetlrjxqduhqgpupoijlrwsoegnbnnvebovnhftsxkcdwxwezmfegapnuxyfoterzyeivuwosvbnjywfomyynvsmlpwwnwzoksnvvoiahlx";
        String ans = "iqkb";
        assertEquals(ans, solution.longestDupSubstring(s));
    }

    @Test
    void longestDupSubstring5() {
        String s = "qzyhifqvxqzjftmnrozudbqnwnovmjlrfpzcumagueeahlbkdpccwvlyggbbmluorefmddfqsxjncwiawmntgvklieagbosrwblqfeusxwcdhzauvrgjwdrdortzprzpotbtrfjafvzvjaaogzwrpaqytipkrgulfrxvsvybbevwebmmkmvaqdpmoihqbuyehxrewwwuinzkvcinxwijsrygswvbhlqvvejkbhzoekacvgrvkmwfkxcobeupjlxbsbsvuurkaacvdrzlxbeafvowsxisawxvoxoudjynnpsepyjppztunldfvehezknznvksrxdpjxskpatjapombnrrjvpaymietxkuuxjsioxinkuzsjdudmnwenonbxsyildtozmskrjkhebwqzcuqysoiakrdrlihjpxwcwpwajgmdoluoytldpgwpjaumfasvwuiqfvhlvbnpxjxffebnbhtdgxctsvgzbgjswyarawfauiehivqaidizgwasezqpvahhupdnzrjvqkovwkatzvdklnsoqmxsvvxelepndelokgnwnymyhicrzjwssnjoolffudjpozthldqkilznfxocizwvhlfgsfjhtugkmjqqarkvvzrmxijhlhfhubnuvtlotwvydfuwczluhyrswnhqgwlfjbjjcrwrxqwjqyjqnhmgadtzbnweqphvkmnuzobfyrmbsitbhpnjeczmvfgbffixuihzbznkaxaxdkpxqokhmjpfoscvkmvocmdskuhvjjuzvvcfytjfaqshlmyeufdmbshqmkhbmzgxylvzafqiofazrpxpbvenirsbjqeamwucckyvdexihynrorzwybjmhtvbuiecpwxdernpxivcryawaujagxuyptynbaszvrumcqkipskasdjjqlltetdcafotqllogdbaodktkkmxnaomehrlrsnhxycbjpwokldvtrxgcrbibpqxomjtlqmhdhueegtuperalubyjuvypnybazizbniogoizhftvvviuhllqynloygtnesqsvjmysdlnhusiqsbybkfiaampozicopqyubyzujxpwycuqphothkihdaffeguybshepkzlwshebpasdrsokntokwgmvglewkauzhbepbetvvlewiqonszdnnczwdlsumqjtcenzejrbfxnhcrbindztbvpdjcrwpppdhccpljjkcnfpkqwinnmlwlvcorgnblovryqkytxargedbyxmbybamiuxkraivtvmzyszuzzjdcfxkaqazaugciqflfsnncokdiuytzaelbclipmmeajsefgdwjrttxrokerobjgkmbgrwppojqgecpuyljjjiogqmyakjoyqykphuhqgomhgufrkuxaizanaclswlmmorpclkxcclaviqaqiauoxfjjznanbuhxpdoxuvfouprwtqfkzjlgwiaamqohsjpzhltvendnoimuwaibnzssetsslsrsejestzoizrjpvrctrxjgsikdpigphzaeuzzjqbhlsxzvghnfdkusztgbffyutmoirsfnclhngedhaamxveqyuryrhbvglfybtcjoesruiptbcgfsrueuwuldibxnfptopsihvqwzmuzubbxvxjwpfiearhsulqspckmrbioaqgdojotwbbbxhihjssdnlbinwavkkjhnmbdawbstycmfmbkiilkegersyzuaqtphgtshlesebaovmmnislipujlwkruxyecsvwbapcegwumnardxhkamimimzjjvmqujuqhwrbbyoebpaihkykfrlvnzqfndkbcxyugsuygdujavwasdjudnjueibtuflzzftehmrpkhuxdgkjffuoetfbmqlftgozscaelrlewzqpbfholvqruxzuvefewqeqjplwpkaydqmjomjbjqqepnepmzfqzwpwysquulnflrmoiaxcqmviakxjmyhujmrgpjbkbzevyebvshxndrcboadkjnqbyvdwnblkohqaytwpszoyfknigeqfnvjvmsefdwhaeljrfzemwoeyorrhyfaqwuwhdglifxcqumzeuavzaqgcjrkliuqgxyadanbdnuvpczxoaoxnxqqxhkruilmymaotxdntvezuxobgnhsmfgnschyoqmzhgomnpjcjptpdsrxgitmruufwposmzdxdilmvnxjhewjvgnuftvrqqoctrhtrpsjfjzbgzrjydrwjqgivavlexosfgajzuctseqnnnqdjljbxetojiyhuxulcpimgbswllngoiobkbrgmaxjvpcpfkvdcecmfhcvgwnzrufcmbmtrqlarwgfvypwmycqyqnqinrehbtukntpowannukmrxjocnvxoejvapoifopuojqkpwkdblbizyimmtwbyymazbtirnmycejseigroyilwgcrzgfwmfempbpdabkzkndlxuxzlymucjvsledhxsgezuclfiflkvzwklqicteklwjkstycvtxlbywqupvjozfjewahfyewpnxuajrsntlzcqssgdvkjaldswdphppjacuixjhlozpfquwdtagyzwjzqmflsnjacbtyqrvlkcbjoofuliibtvlqxjwehxmqmwzvvpibxwpwiujbuotbpcddrbgjvrsbocklkadsjlvajlyksnbkosmsetipgsmmdbwtfwrfzvwsffwwwxnbzwebglwveirgakvbukzchzyezvimfyitydeezmruedfgkyvjhqtoehcufjpglptrqlvybmgowqszxbtjnzccujhqtdchjafsnousmzfmfrvnimprcanprnkqcdlxwotpixhvyvixejxwjxeqxryxkdgdmjxuameonlfwnqgwbmozdpmbkucdzybdddsbvgubfdyczulxrnoexvphcmllsdelzqiumyfdydlodkqdvzwwbhienvmuppuzmdvaheydelpmohawyuphnjezqofwqumlcvstzbqfmwunecbbwuopqbojiubxjroaksgiyndorwqgxikdtaluovrcztauunrhefeacbqqrmytdmhgfwkhipuomzovkdlcfehbgtvkkpoivmphibrgqwprbvpihfjdlwufuygehwyzecervyvcjwelstvrhanhopgmxpwooocczhzxzopsubbtolnhgmvbxoodrldugfpppgzreraddkjogvkcmzdwejlwecznstjlwyuccmxdachmougvtxqurjxwhyidjpsriaeepcijyhixipgwvkinhwsqnaxkifsltgcooluvqyjtvbtzjqqddizngtofaqwhlmhwsteqmxwmmivxetbmqquheyfzjpwjzhmmrljisvfmanmlvyweqebaitfgekligdrckntkhsrkfcqqmqvxffdcgnqswlqbfrujislqqoalwhakechbrqodfyccquslsimrauzmuiqajeidzbdhacpengtbsqnkjrrnmculbznjxruzmjxvytzjpqjrurndhyxwegkjvazhrzibeymfgsmmmmtusbrjittiqmrpzcdtancxkfhlofrltvmdzabzqvildqqtdxzztgqrtzndmgjaznjkihbotpwhaqabbllcufkmzbkkqwexikvmvykntyuemdcptkugjzlvwzluipurwbvmymfvbaamqbcithdpsinizebkrcirdnuzzqooqsisyaibmdzsbsagjlqlepbddwopuycrnosmmrsdhsuxvuillbqtfkqettcvfdckhfromtemionkddaimrrgqseusnvhasnuazmpjvxmbjfvwkufbkgqddalpjmleabxenklrudejfklzljqthwpvjrgsmgtmkdekmqqbreajorzhovtokggmpkraxfxwyjidnmmrscjugeytjifpujqabhggsslblgbrutmudwvzboonwvmgooqqdnfmumigtvbjpofgqhyzqrabypwgrpspomwjlmutpcdzvbfcpeeyprktxbtskxtxiyopqqwcvcaahfbklygkwdrrnuqjwujjggflkewnbmmhmaypeukwznuyotqsmgxeswfxtueaqhtbywmuqdhzfbjbshjfuybkgmpozbujwqfcrdzvibrfzkbhfyjgbqwboqxcuxaylqzvwaxoftbuwexhgeipabnpdierfxqakokuynogkwkzgtijcldmohmrgojijxgjmvgbroisvvzluaknwvemcjetvccctpsgcswpxdcqwzhgygjidormnuvngtlayhddoulhpjqjhnzwkgqbzmyktsodervfgtsdgcwlpslnrjispdrvhefdwrypkcflwalgibowrsarrdchumoozmxwcyzoyiglimmpaiamjghhmkooodoxejmiyupxvbzpqrlmwshansnnldgdqqqjpovjctcjsfakxjtaxvtyeivyeqswnaetyugdwtipkorimmjcdhvcwaaxjbfhmjvvzzalvrfsqtcblwodifqaowgeyrpjlqfjvsiwiolxktihplymyqnyhshahzsyxuslcicjtamqyajmwcdwnlhctlckhrjqnhrvgsgwdcsrlzgittybcghdhvqwgavpkzgscdgcpbhmimcjcmtxauqrnsjthsgubdepkalwoijbjiujyorolrcbyjurgnszjfcaqijljyefddnhkogbedhvvfycjgcbfiepincgckvsabhltdndlhzqbhfsexaikprzmenteuvzvrgsfuppovqttdunncecggkwrhlqkogapefamibecsjampvqcsfuyybuyugbyohwyizikcypqqqvgncvkvrpaypfwgzxyjlnhhspgrihratkqydgvcikatswrlrouvxrmerolrclryccaxyextwmvnjjmzhblrduevfhidyymkwsvcxcvfebljpeasxovpsrggyobprgyskppyqijwbrrclbjhthteejbeiwufuxnralcfounqoymilqjshxzjnldaygssmgwhyhbqfburgqmvaiislavovqgqfftdwuyrsryzxkcvavxigaslnxcldjlshzziactsxpdrxdkmpsmbqvflqsqgvafadhrfczuctuogtcpbqxgbhfmgzbiilzjvzrdxocgubhbyapkcrogxxetcixinxdfizxmqxhvrjxiuostknxggnzvxizantzrbkqjopjbuijnxgkwwvoxatisuebrihofhxrnkawihsdtyqzpnxiuwrzwkqhpxivksermwuvylanotmwugimycbhsdnbtgtdfltzmlrqycqrqynaktrwllwfiyfduwgrmjocovkgxaknfsgtrgbbcobqgrapmsocjgzjiivhxpekxchmaesbcwkrchfafsyrepjurybslsmjutzjqzugytefrajxohpvtuzlyvgvynlrxmvjqejfqkjifrddkggydmwbylhxbspgmtksqgrsfrmjfxruayuptdpkwgupxqnwavwizhozbqlzvkajybdrwffokxobplphjcrkcgmkbcjxnafbbfwnowsfmepczhwvydrmkqmvsuxfiawdmhlyzxsseqvwncgubzxrdjhlyacvwmexumujfreeffhkqgxxheurudgtfpblgwtbbgshyqybjzpjncqpdhurjvgvvlmukaqwnpiflfmeiuwtqbaidvuhgceuetnrafuuaohnifvuzrxzbytqymgfbzfstvrljrogqoizwtmmxxrinbayohbjbhyyajpawstcqbifblkraduhnldtcusrpcyncoqpkrizsrhlpndzwsttcbhhwkynffmlsdjseiswoogfftxvuwadfjkuowpazberekjkvpblwlauqxcnfkoctcjraauxlkwglaoyzfsfsjmhqkjejqthhxcikeyexbwzbpkbeokjbvwbaiddkhgeleguombrubdazlkwgzuieuazbgjzbwvzktjpfpetnvggparepplkitwwjfyyrkowmdvkbstryjeuihtceoojtpzrfozpkndtdfvzynxnqgxnkqlhvctjbenatmjplpiidhuwnmqhcypuzyejhqkzcdifzcwkkjqmioiugxqovwawtptphkqahoimszxdwiledlhktwikiviageynbmsslqrbbqrwanfkoonsurnwonxovhjltpnxeykymuamqghwuawmszbzxmnjskrbmoemdfkhacomtydxuimrfurypacddqyvjpwazzkfynqcvrjbglsqnxmxypzzgcnjiynvzyzdvclgorbsymsxsumzmyxlsmsagkrkkpuaixodkwghrzvtufyqiwcnyexiykaldlwszlarkpcwqgjdckqtolhwsaihlajvhnwelioirzicdsryicyknlodzfgnrexjxrzfhhtlfvuttccbavqsfwkptfrqbofvvfuyloaeyywawynkuhdprnbgslccvnlmelpzxzsyhnioezpzhychfxggxydcdoxrmylqqfhsuzsknwtjivnotqcutsbmkgenaomusnabqfvzncjjobczkiokayolaipefuwspsxitnkazzzaismvqlipllwpltyfiksmecajqpobpcipmyzzlwfpgpooxzjspywjsthhosuhmlgfowdynordgrxirfelicizbqekbvzsmffjtonphoznqoidhfomhnvyavlhqnapuherhxqlzyeyswnfdrixkagkhbmovprtrqiojnyrbaozzenamujynxwymymqcsqptyypptoqjutirxoyychearrbtlkswiqwkrddwiuchjlfvattexashrkicdrujeganeknpgrteknfoqfacblczykohcwhgmhscorpchemulmmrpkhmroztajfsjhtoukmkfaxwadlidhfwvxesvdvsstsfouejqphkxrhbsqaybyiwdabnugehfnwyocddkmacaqbzyvaqcgbuiqujqingzxwlrhpzmiwxqgyakmsjatblzmykxfgswxssqdetnxmbwmhfmiygcwoehbbcjurcpbmnkrmmqhqnnbgxngrsrcyqbcgwmfxohgpkjolonzpiyxpzzxkzbskimbaxynlkhnlhszrwkzikoemtelclfblrzmczakkjsruknwgkfhenjbqqptglabctxbaeuuolumwcoewpaxoyugwzcwgrfmfzpmnsudtodrcvvqzxbripppclpmuanltyzlbxqrlbpglddhmybqqbztzfhassmwmughewypxoqyigkbvrslppvcljljweghsoavviljpxyuizsvqmpyajtucqywrdfgzwsfqujpcqmyjzllgnwjbeaorebdtjrzyryfvtxzabiihhyaommjtregkzbkqnpcrombipdsaksauwkmknnddoeusjohvhybubgicjrfdtitjwzfpzozdjfzbtzcvbvpsrknbrlbmgkgcsjeuuncscektrnyuidrnhmjsukjbbjvyqrkhsktkxlqomrefacmdvfkikdpjewhcssucebcjvmnbgohufhmzfoitjwcwmdbqemzhsdyzlkhwgpwaajfcctlcdotlbmwwygwycailktbxaskhveletgjfknimiyxzjotndkoveohzfbrvmgtuavsozlpqjqtvtoneuwgyfcwriijmvegbrzqstefbjxilfdcjzstkcqdbydzoqrlarmdiaqwwfeoppsjexlfclsxtcveqapjtgaykcexjrwkrtapcdoauxfstrqqgwkoabmcmbkxxtiodchrhdcpynbycqeokfeqemohevcndlflitkyldnfxicszkcqpjcznsglprmdqdiatlfumewlvgcepulxteszpiijbuwajwsseesrafapnngexwfnuvefkaiggkhisvfykbaekdtwvypuknliczohuqntlxtfxkfwuqakbeeskgwxnchwglehactftlanjmwmzkmcesvwgnlvwodtlijskdpcdpuqzrfqdsdwwfruefbomruafbrcpojibzvdeujybrbkleoqfmnbpuxwpddlyxaqqlglsphkbgdqdhxecfzaxghwxncbulydniummqycuuejbzesrnxdkmtchkcoomzzolsdpxamsshmuyfrcvyxwzwayzuuyycboqhwaohfqckhwuactcpomwaaqubmgwsoskfkrztltimqfeatygijqgajgldzrwlemgxxgwjpxjlyukjxqjzgutwdquancxknjrepytcldsqahqpvchrgyoiqvmubivatvwwxpqmraxdhbojaccupwjvejpwgservfeiuerudjharlljayvdkoavmpbobrptjzuvqhndjspwmcwqjleejncbojnhiofinchxkqhtyfuzmttnlcfrvglztoezizqhzoabpgmimepacgjymuuuhdbitdcpmgrjfakgeigtmaqbiqktyarfphecrkxqahxcbkdfafvcfuufmyspsmmlokmmwgzkovaiewlossfcaqccfjqdnnmrldbbempkzlknpobuozmtbojtvzzjfosedmhmvshxhknoaulcpxyrawdbygocekxodantypuromnouxwjvnagndmphpwflabnjbkpowmunpfthxgzhoucncxtscz";
        String ans = "rolrc";
        assertEquals(ans, solution.longestDupSubstring(s));
    }

    @Test
    void longestDupSubstring6() {
        String s = "okmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajvielokmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajviel";
        String ans = "okmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajviel";
        assertEquals(ans, solution.longestDupSubstring(s));
    }
}