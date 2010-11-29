package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IbhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IbhHist
 * @author MyEclipse Persistence Tools
 */

public class IbhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IbhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IbhHist transientInstance) {
		log.debug("saving IbhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IbhHist persistentInstance) {
		log.debug("deleting IbhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IbhHist findById(com.gopawpaw.erp.hibernate.i.IbhHistId id) {
		log.debug("getting IbhHist instance with id: " + id);
		try {
			IbhHist instance = (IbhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IbhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IbhHist instance) {
		log.debug("finding IbhHist instance by example");
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
		log.debug("finding IbhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IbhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IbhHist instances");
		try {
			String queryString = "from IbhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IbhHist merge(IbhHist detachedInstance) {
		log.debug("merging IbhHist instance");
		try {
			IbhHist result = (IbhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IbhHist instance) {
		log.debug("attaching dirty IbhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IbhHist instance) {
		log.debug("attaching clean IbhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IbhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IbhHistDAO) ctx.getBean("IbhHistDAO");
	}
}