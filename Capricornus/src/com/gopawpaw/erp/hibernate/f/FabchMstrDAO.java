package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabchMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabchMstr
 * @author MyEclipse Persistence Tools
 */

public class FabchMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabchMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabchMstr transientInstance) {
		log.debug("saving FabchMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabchMstr persistentInstance) {
		log.debug("deleting FabchMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabchMstr findById(com.gopawpaw.erp.hibernate.f.FabchMstrId id) {
		log.debug("getting FabchMstr instance with id: " + id);
		try {
			FabchMstr instance = (FabchMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabchMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabchMstr instance) {
		log.debug("finding FabchMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FabchMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabchMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabchMstr instances");
		try {
			String queryString = "from FabchMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabchMstr merge(FabchMstr detachedInstance) {
		log.debug("merging FabchMstr instance");
		try {
			FabchMstr result = (FabchMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabchMstr instance) {
		log.debug("attaching dirty FabchMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabchMstr instance) {
		log.debug("attaching clean FabchMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabchMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabchMstrDAO) ctx.getBean("FabchMstrDAO");
	}
}