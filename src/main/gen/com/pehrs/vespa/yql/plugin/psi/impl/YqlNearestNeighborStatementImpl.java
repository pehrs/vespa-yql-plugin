// This is a generated file. Not intended for manual editing.
package com.pehrs.vespa.yql.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.pehrs.vespa.yql.plugin.YqlElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.pehrs.vespa.yql.plugin.psi.*;

public class YqlNearestNeighborStatementImpl extends ASTWrapperPsiElement implements YqlNearestNeighborStatement {

  public YqlNearestNeighborStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YqlElementVisitor visitor) {
    visitor.visitNearestNeighborStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YqlElementVisitor) accept((YqlElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YqlStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YqlStringLiteral.class);
  }

  @Override
  @NotNull
  public PsiElement getNumber() {
    return findNotNullChildByType(NUMBER);
  }

}