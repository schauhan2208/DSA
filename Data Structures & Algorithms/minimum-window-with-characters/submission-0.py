class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) < len(t):
            return ""
        
        tcount , window = {} , {}
        for i in t:
            tcount[i] = 1 + tcount.get(i , 0)

        have , need = 0, len(tcount)
        res , resLen = [-1, -1], float("infinity")
        l = 0
        for r in range(len(s)):
            i = s[r]
            window[i] = 1 + window.get(i , 0)
            if i in tcount and window[i] == tcount[i]:
                have += 1
            
            while have == need:
                if (r - l + 1) < resLen:
                    res = [l, r]
                    resLen = r - l + 1

                window[s[l]] -= 1
                if s[l] in tcount and window[s[l]] < tcount[s[l]]:
                    have -= 1
                l += 1

        l , r = res
        return s[l : r + 1] if resLen != float("infinity") else ""




        